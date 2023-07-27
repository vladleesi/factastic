package dev.vladleesi.factastic.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.vladleesi.factastic.presentation.AppViewModel
import dev.vladleesi.factastic.presentation.FactasticApp
import dev.vladleesi.factastic.presentation.FactasticTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = AppViewModel()
        setContent {
            FactasticApp(viewModel)
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    FactasticTheme {
        GreetingView("Hello, Android!")
    }
}
