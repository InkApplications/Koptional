Koptional ⚡️
=========

Not the Optional Kotlin wanted, but the Optional it deserves.. 😩

🍻 Tastes Great with RxJava!™

What is Koptional?
------------------

This is a *very* simple implementation of an Optional class, like the one in
[Arrow] or [Guava].

[Arrow]: https://github.com/android10/arrow/blob/master/src/main/java/com/fernandocejas/arrow/optional/Optional.java
[Guava]: https://github.com/google/guava/blob/master/guava/src/com/google/common/base/Optional.java

Why Use Koptional?
------------------

Koptional is written in Kotlin, so the Kotlin compiler doesn't have to interpret
the nullability of values, and sometimes fails.

```kotlin
Optional.of(maybeInt) // Returns Optional<Int?> in Arrow/Guava 😧
```

Koptional lets Kotlin's nullability features shine by directly allowing you
read access to the value of the optional, you can continue to use kotlin's
features for null checks directly

```kotlin
val optional = Optional(maybeInt)
val withDefault = optional.value ?: 50
```

Installing Koptional
--------------------

If you haven't already, add JitPack to your gradle repositories.
This sweet baby boy 👶 will give you access to install our libraries.

```groovy
    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
```

Then just add it as a dependency to your module!

```groovy
    compile 'com.github.InkApplications:Koptional:1.0.0'
```

Using Koptional
---------------

Using Koptional is easy 🍰

### Creating optionals

Koptional just uses a standard class constructor. 👷‍

```kotlin
val optional = Optional(maybeInt) // Gives an Optional<Int>
```

### Checking / Accessing value

Koptional is just a dumb wrapper. 😵
Values can be accessed and tested through properties:

```kotlin
val optional = Optional(maybeInt)

if (optional.isPresent) {
    printLn("Check that value: ${optional.value}")
}
```

If you wanna go deeper ⌚ into Kotlin world, we've got some inline methods you
can use for checking values more declaratively 📢
 
 ```kotlin
val optional = Optional(maybeInt)

optional.whenPresent {
    printLn("Check that value $it")
} whenAbsent {
    printLn("There's no number!! 😡")
}

// or just

optional.whenAbsent {
   printLn("Pary while the numbers are away! 🎉")
}
```

### Default / `or`

Koptional doesn't have a method for `.or(T)` like others.
That's because doing this in Kotlin is easy by itself 👌😩

```kotlin
val optional = Optional(maybeInt)
val withDefault = optional.value ?: 50


printLn("This value always exists ➡ $withDefault")
```

## Feature Requests

Kotlin's pretty dope 🤑 – If you've got more methods to make this even
simpler or more useful then just make a PR. Keep it Simple. ✌
