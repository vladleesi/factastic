package dev.vladleesi.factastic

import androidx.compose.ui.window.ComposeUIViewController
import dev.vladleesi.factastic.presentation.AppViewModel
import dev.vladleesi.factastic.presentation.FactasticApp
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    val viewModel = AppViewModel()
    return ComposeUIViewController {
        FactasticApp(viewModel)
    }
}
