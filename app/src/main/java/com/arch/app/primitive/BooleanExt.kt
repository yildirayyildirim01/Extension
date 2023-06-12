package com.arch.app.primitive

fun Boolean?.toSafeGet(): Boolean {
    return this ?: false
}