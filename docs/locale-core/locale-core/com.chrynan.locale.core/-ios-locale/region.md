//[locale-core](../../../index.md)/[com.chrynan.locale.core](../index.md)/[IosLocale](index.md)/[region](region.md)

# region

[ios]\
open override val [region](region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Returns the country/region code for this locale, which should either be an uppercase ISO-3166 2-letter code, a UN M.49 3-digit code, or `null` if it is not available.

This property is an ISO-3166 alpha-2 country code or UN M.49 numeric-3 area code. In the specification, the country (region) field is case-insensitive, but [Locale](../-locale/index.md#-1762194833%2FExtensions%2F2109559298) implementations should always convert the [region](region.md) property to upper-case. Well-formed [region](region.md) values are defined by the following form: `[a-zA-Z]{2} | [0-9]{3}`

Example values:

```kotlin
"US" - United States
"FR" - France
"029" - Caribbean
```

## See also

ios

| | |
|---|---|
|  | [Wikipedia ISO-3166](https://en.wikipedia.org/wiki/ISO_3166) |
