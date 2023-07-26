package dev.vladleesi.factastic.presentation

data class AppState(
    val isLoading: Boolean,
    val fact: String = ""
)
