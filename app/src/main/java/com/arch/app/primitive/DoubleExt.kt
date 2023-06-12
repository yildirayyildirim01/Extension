package com.arch.app.primitive

fun Double?.toSafeGet(): Double {
    return this ?: 0.0
}

fun Double?.toStringValue(): String {
    return this.toSafeGet().toString()
}