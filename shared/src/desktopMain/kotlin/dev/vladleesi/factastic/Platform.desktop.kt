package dev.vladleesi.factastic

class DesktopPlatform : Platform {
    override val name: String = "Desktop"
    override val type: PlatformType = PlatformType.DESKTOP
}

actual fun getPlatform(): Platform = DesktopPlatform()
