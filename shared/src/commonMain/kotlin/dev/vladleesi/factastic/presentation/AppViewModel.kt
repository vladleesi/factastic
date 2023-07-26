package dev.vladleesi.factastic.presentation

import dev.vladleesi.factastic.data.api.getUselessFact
import dev.vladleesi.factastic.data.model.UselessFactsResponse
import io.ktor.client.call.body
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class AppViewModel {

    private val viewModelScope = CoroutineScope(Dispatchers.IO)

    private val _stateFlow = MutableStateFlow(AppState(isLoading = true))
    val stateFlow: StateFlow<AppState>
        get() = _stateFlow

    fun onClick() = viewModelScope.launch {
        _stateFlow.emit(AppState(isLoading = true))
        loadUselessFact()
    }

    fun observeStateForIOS(provideNewState: ((AppState) -> Unit)) {
        stateFlow
            .onEach { state ->
                if (state.isLoading.not()) {
                    provideNewState.invoke(state)
                }
            }
            .launchIn(CoroutineScope(Dispatchers.Main))
    }

    fun loadUselessFact() = viewModelScope.launch {
        val response = getUselessFact().body<UselessFactsResponse>()
        _stateFlow.emit(
            AppState(
                isLoading = false,
                fact = response.text.orEmpty()
            )
        )
    }
}