package domain

import java.lang.RuntimeException

data class Person(
    val name: String,
    val age: Int
) {
    fun isAdult() = age >= 18

    fun hello(): String {
        return "Hello, $name!"
    }
}
