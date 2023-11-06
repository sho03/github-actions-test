package domain

data class Person(
    val name: String,
    val age: Int
) {
    fun isAdult() = age >= 18

    fun hello() = "Hello, $name!"
}
