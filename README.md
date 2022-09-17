# locale

Kotlin multi-platform locale utility (Javascript support isn't currently implemented).
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/locale">

```kotlin
Locale.getDefault()
Locale.parseOrNull(languageTag = "en")
```

## Usage

A Locale is an identifier for a region and/or language. It provides the ability for applications to tailor their user
experience better for each supported region. For example, formatting numbers properly for each region, converting to the
local currency, using the correct time format, and providing different language string resources can all be done with
the help of a Locale. This library provides the `Locale` interface along with ways to obtain a `Locale` and convert it
to another instance. This `Locale` model can be used within code to perform locale-sensitive operations.

For example, obtaining the appropriate string resource depending on the current `Locale`'s language:

```kotlin
object Strings {

    val helloWorld: String
        get() = when (Locale.getDefault().language) {
            "th" -> "สวัสดีชาวโลก"
            "es" -> "Hola Mundo"
            else -> "Hello World"
        }
}
```

## Building

The library is provided through [Repsy.io](https://repsy.io/). Checkout
the [releases page](https://github.com/chRyNaN/locale/releases) to get the latest version.
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/locale">

### Repository

```kotlin
repositories {
    maven {
        url = uri("https://repo.repsy.io/mvn/chrynan/public")
    }
}
```

### Dependencies

```kotlin
implementation("com.chrynan.locale:locale-core:VERSION")
```

## Documentation

More detailed documentation is available in the [docs](https://github.com/chRyNaN/locale/blob/master/docs) folder. The
entry point to the documentation can be found [here](https://github.com/chRyNaN/locale/blob/master/docs/index.md).

## License

```
Copyright 2022 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
