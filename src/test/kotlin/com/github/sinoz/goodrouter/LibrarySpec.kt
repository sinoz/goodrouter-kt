/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.github.sinoz.goodrouter

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class LibrarySpec : StringSpec({
    "someLibraryMethod should return 'true'" {
        val classUnderTest = Library()
        classUnderTest.someLibraryMethod() shouldBe true
    }
})
