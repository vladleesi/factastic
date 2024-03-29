# Factastic

Useless facts every day!

Here's an example of a multiplatform app with shared UI and network logic built with [Kotlin Multiplatform Mobile](https://kotlinlang.org/docs/multiplatform-mobile-getting-started.html) and [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/) for Android, iOS and Desktop.

| Android (Dark theme) | iOS (Light theme) |
| ----------- | ----------- |
| ![Android (Dark theme)](https://github.com/vladleesi/factastic/assets/30999008/481b667f-e985-4b85-a570-ed9adcd79492) | ![iOS (Light theme)](https://github.com/vladleesi/factastic/assets/30999008/f054dfdf-d85b-47ed-b6f0-1b616dafc20e) |

| Desktop |
| ------- |
| ![Screen Recording 2023-08-06 at 5 02 11 PM (1)](https://github.com/vladleesi/factastic/assets/30999008/f7a6dd74-9ad2-45e1-9e3b-af56f866d780) |

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
- `desktop`: Contains the desktop-specific code for the Kotlin Multiplatform project, targeting desktop platforms such as Windows, macOS, and Linux.

### Build
#### Android:
1. Open `androidApp` folder from [Android Studio](https://developer.android.com/studio)
2. Click Run

#### iOS:
1. Open `iosApp/iosApp.xcodeproj` folder from [Xcode](https://developer.apple.com/xcode/resources/)
2. Click Run

#### Desktop: 
1. Open the project from [Android Studio](https://developer.android.com/studio)
2. Execute the command `./gradle :desktop:run` to run the desktop module.
> Since [IntelliJ IDEA](https://www.jetbrains.com/idea/) currently does not support Gradle versions above 7.4.0, follow these steps to address the issue:
> 1. In the gradle.properties file, temporarily change the Gradle plugin version to 7.4.0.
> 2. In the settings.gradle.kts file, disable the inclusion of (":androidApp").

### Licence
This project is licensed under the [MIT License](LICENSE).
