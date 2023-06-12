package com.arch.app.primitive

fun Long?.toSafeGet(): Long {
    return this ?: 0
}
