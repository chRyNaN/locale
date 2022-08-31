@file:Suppress("unused")

package com.chrynan.locale.core

actual val Locale.Companion.US: Locale
    get() = JvmLocale(jvmLocale = java.util.Locale.US)

actual val Locale.Companion.ENGLISH: Locale
    get() = JvmLocale(jvmLocale = java.util.Locale.ENGLISH)

actual val Locale.Companion.EN_US: Locale
    get() = JvmLocale(jvmLocale = java.util.Locale.forLanguageTag("en_US"))
