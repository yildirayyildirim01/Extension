package com.arch.app.primitive

fun Int?.toSafeGet(): Int {
    return this ?: 0
}

fun Int?.toStringValue(): String {
    return this.toSafeGet().toString()
}
