//[locale-core](../../../index.md)/[com.chrynan.locale.core](../index.md)/[Locale](index.md)

# Locale

[common]\
interface [Locale](index.md)

A [Locale](index.md) represents a specific geographical, political, or cultural region. It is often used in application development to provide a more localized user experience. For example, formatting a number to be displayed in an application is considered to be a locale-sensitive operation, since different countries and regions format numbers differently (Some countries may use commas as separators while others may use periods or spaces), as such, a [Locale](index.md) could be used to determine how to format the numbers.

The [Locale](index.md) interface implements IETF BCP-47 which is composed of RFC-4647 (&quot;Matching of Language Tags&quot;) and RFC-5646 (&quot;Tags for Identifying Languages&quot;) with support for the LDML (UTS#35, &quot;Unicode Locale Data Markup Language&quot;) BCP-47-compatible extensions for locale data exchange.

To obtain an instance of the [Locale](index.md) interface, use the constructor functions, such as the [Locale.Companion.parse](../parse.md) function.

Example usage:

```kotlin
Locale.getDefault().language
```

## See also

common

| | |
|---|---|
|  | [iso-15924:2004](https://www.iso.org/standard/29546.html) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [copy](copy.md) | [common]<br>open fun [copy](copy.md)(language: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = this.language, region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = this.region, script: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = this.script, variants: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = this.variants): [Locale](index.md)<br>Retrieves a shallow copy of this [Locale](index.md), optionally overriding the provided values. |
| [getDisplayLanguage](get-display-language.md) | [common]<br>abstract fun [getDisplayLanguage](get-display-language.md)(inLocale: [Locale](index.md) = Locale.getDefault()): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](index.md)'s [language](language.md) value formatted for the provided [inLocale](get-display-language.md). |
| [getDisplayName](get-display-name.md) | [common]<br>abstract fun [getDisplayName](get-display-name.md)(inLocale: [Locale](index.md) = Locale.getDefault()): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](index.md)'s name ([languageTag](language-tag.md)) formatted for the provided [inLocale](get-display-name.md). |
| [getDisplayRegion](get-display-region.md) | [common]<br>abstract fun [getDisplayRegion](get-display-region.md)(inLocale: [Locale](index.md) = Locale.getDefault()): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](index.md)'s [region](region.md) value formatted for the provided [inLocale](get-display-region.md). |
| [getDisplayScript](get-display-script.md) | [common]<br>abstract fun [getDisplayScript](get-display-script.md)(inLocale: [Locale](index.md) = Locale.getDefault()): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](index.md)'s [script](script.md) value formatted for the provided [inLocale](get-display-script.md). |
| [getDisplayVariant](get-display-variant.md) | [common]<br>abstract fun [getDisplayVariant](get-display-variant.md)(inLocale: [Locale](index.md) = Locale.getDefault()): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves a displayable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) of this [Locale](index.md)'s [variants](variants.md) value formatted for the provided [inLocale](get-display-variant.md). |

## Properties

| Name | Summary |
|---|---|
| [language](language.md) | [common]<br>abstract val [language](language.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns the language code of this Locale or `null` if it is not available. |
| [languageTag](language-tag.md) | [common]<br>abstract val [languageTag](language-tag.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a well-formed IETF BCP-47 language tag representing this locale. |
| [region](region.md) | [common]<br>abstract val [region](region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns the country/region code for this locale, which should either be an uppercase ISO-3166 2-letter code, a UN M.49 3-digit code, or `null` if it is not available. |
| [script](script.md) | [common]<br>abstract val [script](script.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns the script for this locale, which should either be an ISO-15924 4-letter script code or `null` if it is not available. |
| [variants](variants.md) | [common]<br>abstract val [variants](variants.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns the variant codes for this locale. |

## Inheritors

| Name |
|---|
| [AndroidLocale](../-android-locale/index.md) |
| [IosLocale](../-ios-locale/index.md) |
| [JsLocale](../-js-locale/index.md) |
| [JvmLocale](../-jvm-locale/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [component1](../component1.md) | [common]<br>operator fun [Locale](index.md).[component1](../component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves the [Locale.language](language.md) component. |
| [component2](../component2.md) | [common]<br>operator fun [Locale](index.md).[component2](../component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves the [Locale.region](region.md) component. |
| [component3](../component3.md) | [common]<br>operator fun [Locale](index.md).[component3](../component3.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves the [Locale.script](script.md) component. |
| [component4](../component4.md) | [common]<br>operator fun [Locale](index.md).[component4](../component4.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Retrieves the [Locale.variants](variants.md) component. |
| [toAndroidLocale](../to-android-locale.md) | [android]<br>fun [Locale](index.md#-1762194833%2FExtensions%2F-362537344).[toAndroidLocale](../to-android-locale.md)(): [AndroidLocale](../-android-locale/index.md) |
| [toIosLocale](../to-ios-locale.md) | [ios]<br>fun [Locale](index.md#-1762194833%2FExtensions%2F2109559298).[toIosLocale](../to-ios-locale.md)(): [IosLocale](../-ios-locale/index.md) |
| [toJsLocale](../to-js-locale.md) | [js]<br>fun [Locale](index.md#-1762194833%2FExtensions%2F1142978236).[toJsLocale](../to-js-locale.md)(): [JsLocale](../-js-locale/index.md) |
| [toJvmLocale](../to-jvm-locale.md) | [jvm]<br>fun [Locale](index.md#-1762194833%2FExtensions%2F-1283056228).[toJvmLocale](../to-jvm-locale.md)(): [JvmLocale](../-jvm-locale/index.md) |
