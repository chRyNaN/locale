package com.chrynan.locale.core

internal inline fun <Key, Value> mapOfNotNull(vararg pairs: Pair<Key, Value>): Map<Key, Value & Any> =
    pairs.filter { it.second != null }
        .filterIsInstance<Pair<Key, Value & Any>>()
        .toMap()
