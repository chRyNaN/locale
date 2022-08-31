//[locale-core](../../../index.md)/[com.chrynan.locale.core](../index.md)/[AndroidLocale](index.md)

# AndroidLocale

[android]\
class [AndroidLocale](index.md) : [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)

## Functions

| Name | Summary |
|---|---|
| [copy](index.md#577348943%2FFunctions%2F-362537344) | [android]<br>open fun [copy](index.md#577348943%2FFunctions%2F-362537344)(language: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = this.language, region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = this.region, script: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = this.script, variants: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = this.variants): [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)<br>Retrieves a shallow copy of this [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344), optionally overriding the provided values. |
| [equals](equals.md) | [android]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getDisplayLanguage](get-display-language.md) | [android]<br>open override fun [getDisplayLanguage](get-display-language.md)(inLocale: [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)'s [language](language.md) value formatted for the provided [inLocale](get-display-language.md). |
| [getDisplayName](get-display-name.md) | [android]<br>open override fun [getDisplayName](get-display-name.md)(inLocale: [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)'s name ([languageTag](language-tag.md)) formatted for the provided [inLocale](get-display-name.md). |
| [getDisplayRegion](get-display-region.md) | [android]<br>open override fun [getDisplayRegion](get-display-region.md)(inLocale: [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)'s [region](region.md) value formatted for the provided [inLocale](get-display-region.md). |
| [getDisplayScript](get-display-script.md) | [android]<br>open override fun [getDisplayScript](get-display-script.md)(inLocale: [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)'s [script](script.md) value formatted for the provided [inLocale](get-display-script.md). |
| [getDisplayVariant](get-display-variant.md) | [android]<br>open override fun [getDisplayVariant](get-display-variant.md)(inLocale: [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](../-locale/index.md#-1762194833%2FExtensions%2F-362537344)'s [variants](variants.md) value formatted for the provided [inLocale](get-display-variant.md). |
| [hashCode](hash-code.md) | [android]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | [android]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [androidLocale](android-locale.md) | [android]<br>val [androidLocale](android-locale.md): [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) |
| [language](language.md) | [android]<br>open override val [language](language.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns the language code of this Locale or `null` if it is not available. |
| [languageTag](language-tag.md) | [android]<br>open override val [languageTag](language-tag.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a well-formed IETF BCP-47 language tag representing this locale. |
| [region](region.md) | [android]<br>open override val [region](region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns the country/region code for this locale, which should either be an uppercase ISO-3166 2-letter code, a UN M.49 3-digit code, or `null` if it is not available. |
| [script](script.md) | [android]<br>open override val [script](script.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns the script for this locale, which should either be an ISO-15924 4-letter script code or `null` if it is not available. |
| [variants](variants.md) | [android]<br>open override val [variants](variants.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns the variant codes for this locale. |
