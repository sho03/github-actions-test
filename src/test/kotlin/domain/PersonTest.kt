package domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PersonTest : StringSpec({

    "isAdult() should return true if age is 18" {
        val person = Person("Alice", 18)
        person.isAdult() shouldBe true
    }

    "isAdult() should return false if age is 17" {
        val person = Person("Bob", 17)
        person.isAdult() shouldBe false
    }
})
