@file:Suppress("unused")

package com.chrynan.locale.core

actual val Locale.Companion.US: Locale
    get() = AndroidLocale(androidLocale = java.util.Locale.US)

actual val Locale.Companion.ENGLISH: Locale
    get() = AndroidLocale(androidLocale = java.util.Locale.ENGLISH)

actual val Locale.Companion.EN_US: Locale
    get() = AndroidLocale(androidLocale = java.util.Locale.forLanguageTag("en_US"))
