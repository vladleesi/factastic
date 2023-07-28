package dev.vladleesi.factastic.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FactasticApp(viewModel: AppViewModel, modifier: Modifier = Modifier) {
    FactasticTheme {
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            val state = viewModel.stateFlow.collectAsState()
            LaunchedEffect(Unit) {
                viewModel.loadUselessFact()
            }
            MainScreen(state.value, viewModel::onClick)
        }
    }
}

@Composable
private fun MainScreen(state: AppState, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize().padding(32.dp)) {
        if (state.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        } else {
            val text by rememberSaveable { mutableStateOf(state.text) }
            Text(
                text = text,
                modifier = Modifier.align(Alignment.Center),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }
        Button(
            onClick = onClick,
            modifier = Modifier.align(Alignment.BottomCenter),
            enabled = state.isLoading.not()
        ) {
            Text(text = "Let's rock!", fontSize = 18.sp)
        }
    }
}
