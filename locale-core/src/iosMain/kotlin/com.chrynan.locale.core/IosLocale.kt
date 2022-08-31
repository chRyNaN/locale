@file:Suppress("unused")

package com.chrynan.locale.core

import platform.Foundation.*

class IosLocale internal constructor(@Suppress("MemberVisibilityCanBePrivate") val iosLocale: NSLocale) : Locale {

    override val language: String?
        get() = iosLocale.languageCode.takeIf { it.isNotBlank() }

    override val region: String?
        get() = iosLocale.countryCode?.takeIf { it.isNotBlank() }

    override val script: String?
        get() = iosLocale.scriptCode?.takeIf { it.isNotBlank() }

    override val variants: List<String>
        get() = iosLocale.variantCode?.takeIf { it.isNotBlank() }?.split(Locale.VARIANT_SEPARATOR) ?: emptyList()

    override val languageTag: String
        get() = iosLocale.localeIdentifier

    override fun getDisplayLanguage(inLocale: Locale): String? =
        language?.let { inLocale.toIosLocale().iosLocale.displayNameForKey(NSLocaleLanguageCode, it) }
            ?.takeIf { it.isNotBlank() }

    override fun getDisplayRegion(inLocale: Locale): String? =
        region?.let { inLocale.toIosLocale().iosLocale.displayNameForKey(NSLocaleCountryCode, it) }
            ?.takeIf { it.isNotBlank() }

    override fun getDisplayScript(inLocale: Locale): String? =
        script?.let { inLocale.toIosLocale().iosLocale.displayNameForKey(NSLocaleScriptCode, it) }
            ?.takeIf { it.isNotBlank() }

    override fun getDisplayVariant(inLocale: Locale): String? =
        inLocale.toIosLocale().iosLocale
            .displayNameForKey(NSLocaleVariantCode, variants.joinToString(separator = Locale.VARIANT_SEPARATOR))
            ?.takeIf { it.isNotBlank() }

    override fun getDisplayName(inLocale: Locale): String? =
        inLocale.toIosLocale().iosLocale
            .displayNameForKey(NSLocaleIdentifier, languageTag)
            ?.takeIf { it.isNotBlank() }

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
    IosLocale(NSLocale(languageTag))

actual fun Locale.Companion.getDefault(): Locale =
    IosLocale(NSLocale.currentLocale)

actual fun Locale.Companion.getAvailable(): List<Locale> =
    NSLocale.availableLocaleIdentifiers.map { IosLocale(NSLocale(it.toString())) }

actual fun Locale.Companion.fromParts(
    language: String?,
    region: String?,
    script: String?,
    variants: List<String>
): Locale {
    val components: Map<Any?, Any> = mapOfNotNull(
        NSLocaleLanguageCode to language,
        NSLocaleCountryCode to region,
        NSLocaleScriptCode to script,
        NSLocaleVariantCode to variants.joinToString(separator = VARIANT_SEPARATOR)
    )

    val identifier = NSLocale.localeIdentifierFromComponents(components)

    return IosLocale(NSLocale.localeWithLocaleIdentifier(identifier))
}

fun Locale.toIosLocale(): IosLocale =
    (this as? IosLocale) ?: IosLocale(NSLocale(languageTag))
