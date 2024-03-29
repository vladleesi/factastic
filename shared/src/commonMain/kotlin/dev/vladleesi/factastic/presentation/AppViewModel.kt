package dev.vladleesi.factastic.presentation

import dev.vladleesi.factastic.data.api.getUselessFact
import dev.vladleesi.factastic.data.model.UselessFactsResponse
import io.ktor.client.call.body
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class AppViewModel {

    private val viewModelScope = CoroutineScope(Dispatchers.IO)

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        runBlocking {
            _stateFlow.emit(
                AppState(
                    isLoading = false,
                    text = throwable.message.orEmpty()
                )
            )
        }
    }

    private val _stateFlow = MutableStateFlow(AppState(isLoading = true))

    val stateFlow: StateFlow<AppState>
        get() = _stateFlow.asStateFlow()

    fun loadUselessFact() = viewModelScope.launch(exceptionHandler) {
        val response = getUselessFact().body<UselessFactsResponse>()
        _stateFlow.emit(
            AppState(
                isLoading = false,
                text = response.text.orEmpty()
            )
        )
    }

    fun onClick() = viewModelScope.launch {
        _stateFlow.emit(AppState(isLoading = true))
        loadUselessFact()
    }
}
