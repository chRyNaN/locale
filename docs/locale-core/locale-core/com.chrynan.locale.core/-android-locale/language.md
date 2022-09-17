//[locale-core](../../../index.md)/[com.chrynan.locale.core](../index.md)/[AndroidLocale](index.md)/[language](language.md)

# language

[android]\
open override val [language](language.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Returns the language code of this Locale or `null` if it is not available.

This property is an ISO-639 alpha-2 or alpha-3 language code, or registered language subtag up to 8 alpha letters (for support for future enhancements). When a language has both an alpha-2 code and an alpha-3 code, the alpha-2 code **must** be used.

In the specification, the language field is case-insensitive, but [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344) implementations should always convert the [language](language.md) property to lower-case. Well-formed [language](language.md) values are defined by the following form: `[a-zA-Z]{2,8}`

**Note:** The term &quot;BCP-47&quot; refers to both the specification (RFC-5646) and the subtag registry.

**Note:** this is not the full BCP-47 language production, since implementations may exclude support for the `extlang` values.

Example values:

```kotlin
"en" - English
"ja" - Japanese
"kok" - Konkani
```

## See also

android

| | |
|---|---|
|  | [Language Subtag Registry](https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry) |
