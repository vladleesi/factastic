package dev.vladleesi.factastic.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FactasticApp(state: AppState, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize().padding(32.dp)) {
        if (state.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        } else {
            Text(
                text = state.fact,
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