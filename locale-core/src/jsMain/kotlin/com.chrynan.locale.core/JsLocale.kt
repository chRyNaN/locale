@file:Suppress("unused")

package com.chrynan.locale.core

class JsLocale internal constructor() : Locale {

    override val language: String?
        get() = TODO("Not yet implemented")
    override val region: String?
        get() = TODO("Not yet implemented")
    override val script: String?
        get() = TODO("Not yet implemented")
    override val variants: List<String>
        get() = TODO("Not yet implemented")
    override val languageTag: String
        get() = TODO("Not yet implemented")

    override fun getDisplayLanguage(inLocale: Locale): String? {
        TODO("Not yet implemented")
    }

    override fun getDisplayRegion(inLocale: Locale): String? {
        TODO("Not yet implemented")
    }

    override fun getDisplayScript(inLocale: Locale): String? {
        TODO("Not yet implemented")
    }

    override fun getDisplayVariant(inLocale: Locale): String? {
        TODO("Not yet implemented")
    }

    override fun getDisplayName(inLocale: Locale): String? {
        TODO("Not yet implemented")
    }

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
    TODO()

actual fun Locale.Companion.getDefault(): Locale =
    TODO()

actual fun Locale.Companion.getAvailable(): List<Locale> =
    TODO()

actual fun Locale.Companion.fromParts(
    language: String?,
    region: String?,
    script: String?,
    variants: List<String>
): Locale = TODO()

fun Locale.toJsLocale(): JsLocale =
    (this as? JsLocale) ?: TODO()
