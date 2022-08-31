@file:Suppress("unused")

package com.chrynan.locale.core

import platform.Foundation.NSLocale
import platform.Foundation.localeWithLocaleIdentifier

actual val Locale.Companion.US: Locale
    get() = IosLocale(iosLocale = NSLocale.localeWithLocaleIdentifier("US"))

actual val Locale.Companion.ENGLISH: Locale
    get() = IosLocale(iosLocale = NSLocale.localeWithLocaleIdentifier("en"))

actual val Locale.Companion.EN_US: Locale
    get() = IosLocale(iosLocale = NSLocale.localeWithLocaleIdentifier("en_US"))
