//[locale-core](../../index.md)/[com.chrynan.locale.core](index.md)/[parse](parse.md)

# parse

[common]\
expect fun [Locale.Companion](-locale/-companion/index.md).[parse](parse.md)(languageTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Locale](-locale/index.md)

Converts the provided [languageTag](parse.md) into a [Locale](-locale/index.md) or throws an exception if it could not be converted into a [Locale](-locale/index.md).

**Note:** Some platform implementations may be more lenient that others and will try to create a [Locale](-locale/index.md) removing any unsupported or unmatched values. This logic is up to the implementing class.

[android, ios, js, jvm]\
[android]\
actual fun [Locale.Companion](-locale/-companion/index.md#792635441%2FExtensions%2F-362537344).[parse](parse.md)(languageTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Locale](-locale/index.md#-1762194833%2FExtensions%2F-362537344)

[ios]\
actual fun [Locale.Companion](-locale/-companion/index.md#792635441%2FExtensions%2F2109559298).[parse](parse.md)(languageTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Locale](-locale/index.md#-1762194833%2FExtensions%2F2109559298)

[js]\
actual fun [Locale.Companion](-locale/-companion/index.md#792635441%2FExtensions%2F1142978236).[parse](parse.md)(languageTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Locale](-locale/index.md#-1762194833%2FExtensions%2F1142978236)

[jvm]\
actual fun [Locale.Companion](-locale/-companion/index.md#792635441%2FExtensions%2F-1283056228).[parse](parse.md)(languageTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Locale](-locale/index.md#-1762194833%2FExtensions%2F-1283056228)
