package com.arch.app.primitive

import java.util.Locale

fun String?.toSafeGet(): String {
    return if (this.isNullOrEmpty()) "" else this
}

fun String?.toLowerCase(): String {
    return this.toSafeGet().lowercase()
}

fun String?.toUpperCase(): String {
    return this.toSafeGet().uppercase()
}

fun String?.toContains(key: String?): Boolean {
    return this.toSafeGet().contains(key.toSafeGet(), true)
}

fun String?.toEquals(key: String?): Boolean {
    return this.equals(key.toSafeGet(), true)
}

fun String?.toEquals(vararg keys: String): Boolean {
    return keys.any { this.toSafeGet().toContains(this) }
}

fun String?.toBoolean(): Boolean {
    return this.toEquals("TRUE", "YES", "1", "Y", "T")
}

fun String?.toIntValue(): Int {
    return try {
        this.toSafeGet().toInt()
    } catch (ex: NumberFormatException) {
        0
    }
}

fun String?.toFloatValue(): Float {
    return try {
        this.toSafeGet().toFloat()
    } catch (ex: NumberFormatException) {
        0f
    }
}

fun String?.toLongValue(): Long {
    return try {
        this.toSafeGet().toLong()
    } catch (ex: NumberFormatException) {
        0L
    }
}

fun String?.toDoubleValue(): Double {
    return try {
        this.toSafeGet().toDouble()
    } catch (ex: Exception) {
        0.0
    }
}

fun String?.capitalizeFirstLetterEachWord(): String {
    return this.toLowerCase().split(" ").joinToString(" ") { it.capitalize(Locale.ROOT) }
}