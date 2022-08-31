//[locale-core](../../../index.md)/[com.chrynan.locale.core](../index.md)/[AndroidLocale](index.md)/[script](script.md)

# script

[android]\
open override val [script](script.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Returns the script for this locale, which should either be an ISO-15924 4-letter script code or `null` if it is not available.

This property is an ISO-15924 alpha-4 script code. In the specification, the script field is case-insensitive, but [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344) implementations should always convert the [script](script.md) property to title-case (the first letter is upper case and the rest of the letters are lower case). Well-formed script values are defined by the following form: `[a-zA-Z]{4}`

Example values:

```kotlin
"Latn" - Latin
"Cyrl" - Cyrillic
```

## See also

android

| | |
|---|---|
|  | [Language Subtag Registry](https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry) |
