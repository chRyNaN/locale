//[locale-core](../../../index.md)/[com.chrynan.locale.core](../index.md)/[IosLocale](index.md)/[variants](variants.md)

# variants

[ios]\
open override val [variants](variants.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;

Returns the variant codes for this locale.

This property can contain any arbitrary [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value used to indicate a variation of a [Locale](../-locale/index.md#-1762194833%2FExtensions%2F2109559298). In a locale [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), if there are two or more variant values each indicating its own semantics, these values should be ordered by importance, with the most important positioned first, and separated by an underscore ('_'). These values are separated and returned as a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)s from this [variants](variants.md) property, where the [List.first](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html) value would be considered the most important value. If there are no variants, then an empty [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) will be returned. The [variants](variants.md) values are case-sensitive.

**Note:** The term &quot;BCP-47&quot; refers to both the specification (RFC-5646) and the subtag registry.

**Note:** IETF BCP-47 places syntactic restrictions on variant sub-tags. Also, BCP-47 sub-tags are strictly used to indicate additional variations that define a language or its dialects that are not covered by any combinations of [language](language.md), [script](script.md), and [region](region.md) sub-tags. However, the variant field in Locale has historically been used for any kind of variation, not just language variations. For example, some supported variants available in Java SE Runtime Environments indicate alternative cultural behaviors such as calendar type or number script. In BCP 47 this kind of information, which does not identify the language, is supported by extension sub-tags or private use sub-tags.

Well-formed variant values are defined by the following form: `SUBTAG (('_'|'-') SUBTAG)* where SUBTAG = [0-9][0-9a-zA-Z]{3} | [0-9a-zA-Z]{5,8}` (Note: BCP-47 only uses hyphen ('-') as a delimiter, this is more lenient).

Example values:

```kotlin
"polyton" - Polytonic Greek
"POSIX"
```

## See also

ios

| | |
|---|---|
|  | [Language Subtag Registry](https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry) |
