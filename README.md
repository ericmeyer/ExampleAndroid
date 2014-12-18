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

## Useful Files to Look At

 * [AndroidApp/settings.gradle](AndroidApp/settings.gradle)
 * [AndroidApp/app/build.gradle](AndroidApp/app/build)
 * [AndroidApp/build.gradle](AndroidApp/build.gradle)
 * [AndroidLibrary/build.gradle](AndroidLibrary/build.gradle)
 * [JavaModule/build.gradle](JavaModule/build.gradle)

## Running the Tests

 * `gradle test` from `AndroidApp` runs the tests for all three projects
 * `gradle test` from `AndroidLibrary` runs only those tests
 * `gradle test` from `JavaModule` runs only those tests
