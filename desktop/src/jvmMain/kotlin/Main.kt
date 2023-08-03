import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.vladleesi.factastic.presentation.AppViewModel
import dev.vladleesi.factastic.presentation.FactasticApp

fun main() = application {
    val viewModel = AppViewModel()
    Window(onCloseRequest = ::exitApplication) {
        FactasticApp(viewModel)
    }
}
