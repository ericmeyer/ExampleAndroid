# Requirements

 * Android Studio 1.0.1
 * Gradle 2.2.1

# Explanation of Parts

 * **Make sure to open the `AndroidApp` project**
 * You might need to import `AndroidApp/settings.gradle`.

## AndroidApp

 * `AndroidApp` is the main project.
 * It depends on `AndroidLibrary` and `JavaModule`

## AndroidLibrary

 * `AndroidLibrary` is an Android Library.
 * It does not depend on other projects.

## JavaModule

 * `JavaModule` is a pure Java module.
 * It does not depend on other projects.