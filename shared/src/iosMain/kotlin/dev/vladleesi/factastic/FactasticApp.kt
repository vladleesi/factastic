package dev.vladleesi.factastic

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.ComposeUIViewController
import dev.vladleesi.factastic.presentation.AppState
import dev.vladleesi.factastic.presentation.AppViewModel
import dev.vladleesi.factastic.presentation.FactasticApp

fun MainViewController() =
    ComposeUIViewController {
        val viewModel = AppViewModel()
        LaunchedEffect(Unit) {
            viewModel.loadUselessFact()
        }

        var innerState by remember { mutableStateOf(AppState(isLoading = true)) }
        viewModel.observeStateForIOS { state ->
            innerState = state
        }

        FactasticApp(
            state = innerState,
            onClick = viewModel::onClick
        )
    }