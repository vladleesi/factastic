package dev.vladleesi.factastic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform