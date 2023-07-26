# factastic

Here's an example of a cross-platform app built with [Kotlin Multiplatform Mobile](https://kotlinlang.org/docs/multiplatform-mobile-getting-started.html) and [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/) for Android and iOS.

### Stack
- [Kotlin Multiplatform Mobile](https://kotlinlang.org/docs/multiplatform-mobile-getting-started.html)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)
- [Kotlin Serialization](https://kotlinlang.org/docs/serialization.html)
- [Ktor](https://ktor.io/docs/getting-started-ktor-client.html)
- [Napier](https://github.com/AAkira/Napier)

### Project Structure
The project follows the Kotlin Multiplatform structure, allowing code sharing between Android and iOS platforms. Here's a brief overview of the project structure:

- `shared`: Contains shared Kotlin code that is used by both Android and iOS.
- `androidApp`: Contains the Android-specific code, including activities, UI components, and Android-specific dependencies.
- `iosApp`: Contains the iOS-specific code, including view controllers, SwiftUI views, and iOS-specific dependencies.

### Build
#### Android:
1. Open `androidApp` folder from [Android Studio](https://developer.android.com/studio)
2. Click Run

#### iOS:
1. Open `iosApp/iosApp.xcodeproj` folder from [Xcode](https://developer.apple.com/xcode/resources/)
2. Click Run

### Contributing
Contributions are welcome! If you encounter any issues or have suggestions for improvements, please feel free to create an issue or submit a pull request.

### Licence
This project is licensed under the [MIT License](LICENSE).
