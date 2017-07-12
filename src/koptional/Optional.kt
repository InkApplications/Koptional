package koptional

import java.io.Serializable

/**
 * A wrapper for an optional value.
 *
 * A dumb little optional class with just a couple of convenience methods.
 * Kotlin handles nullability pretty darn well. But sometimes you still need
 * an optional class.
 *
 * This optional does as little as possible, letting you lean on Kotlin's
 * nullability operators when available, while also providing a standard
 * wrapper for that thing you know could be null.
 *
 * Tastes great with RxJava!
 */
data class Optional<T>(val value: T? = null) : Serializable {
    val isPresent get() = value != null

    inline infix fun whenPresent(block: (T) -> Unit): Optional<T> {
        if (value != null) block(value)

        return this
    }

    inline infix fun whenAbsent(block: () -> Unit): Optional<T> {
        if (value == null) block()

        return this
    }
}
