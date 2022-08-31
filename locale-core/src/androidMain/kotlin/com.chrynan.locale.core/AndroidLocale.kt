@file:Suppress("unused")

package com.chrynan.locale.core

class AndroidLocale internal constructor(@Suppress("MemberVisibilityCanBePrivate") val androidLocale: java.util.Locale) :
    Locale {

    override val language: String?
        get() = androidLocale.language.takeIf { it.isNotBlank() }

    override val region: String?
        get() = androidLocale.country.takeIf { it.isNotBlank() }

    override val script: String?
        get() = androidLocale.script.takeIf { it.isNotBlank() }

    override val variants: List<String>
        get() = androidLocale.variant.takeIf { it.isNotBlank() }?.split(Locale.VARIANT_SEPARATOR) ?: emptyList()

    override val languageTag: String
        get() = androidLocale.toLanguageTag()

    override fun getDisplayLanguage(inLocale: Locale): String? =
        androidLocale.getDisplayLanguage(inLocale.toAndroidLocale().androidLocale).takeIf { it.isNotBlank() }

    override fun getDisplayRegion(inLocale: Locale): String? =
        androidLocale.getDisplayCountry(inLocale.toAndroidLocale().androidLocale).takeIf { it.isNotBlank() }

    override fun getDisplayScript(inLocale: Locale): String? =
        androidLocale.getDisplayScript(inLocale.toAndroidLocale().androidLocale).takeIf { it.isNotBlank() }

    override fun getDisplayVariant(inLocale: Locale): String? =
        androidLocale.getDisplayVariant(inLocale.toAndroidLocale().androidLocale).takeIf { it.isNotBlank() }

    override fun getDisplayName(inLocale: Locale): String? =
        androidLocale.getDisplayName(inLocale.toAndroidLocale().androidLocale).takeIf { it.isNotBlank() }

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Locale) return false

        return language == other.languageTag &&
                region == other.region &&
                script == other.script &&
                variants == other.variants
    }

    override fun hashCode(): Int {
        var result = language?.hashCode() ?: 0

        result = 31 * result + (region?.hashCode() ?: 0)
        result = 31 * result + (script?.hashCode() ?: 0)
        result = 31 * result + variants.hashCode()

        return result
    }

    override fun toString(): String =
        "Locale(language=$language,region=$region,script=$script,variants=$variants)"
}

actual fun Locale.Companion.parse(languageTag: String): Locale =
    AndroidLocale(java.util.Locale.forLanguageTag(languageTag))

actual fun Locale.Companion.getDefault(): Locale =
    AndroidLocale(java.util.Locale.getDefault())

actual fun Locale.Companion.getAvailable(): List<Locale> =
    java.util.Locale.getAvailableLocales().map { AndroidLocale(it) }

actual fun Locale.Companion.fromParts(
    language: String?,
    region: String?,
    script: String?,
    variants: List<String>
): Locale = AndroidLocale(
    java.util.Locale.Builder()
        .setLanguage(language)
        .setRegion(region)
        .setScript(script)
        .setVariant(variants.joinToString(separator = VARIANT_SEPARATOR))
        .build()
)

fun Locale.toAndroidLocale(): AndroidLocale =
    (this as? AndroidLocale) ?: AndroidLocale(java.util.Locale.forLanguageTag(languageTag))
