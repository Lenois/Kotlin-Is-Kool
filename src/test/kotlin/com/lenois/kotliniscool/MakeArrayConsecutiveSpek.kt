package com.lenois.kotliniscool

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class MakeArrayConsecutiveSpek : Spek({
    given("the make consecutive array fn") {
        on("[6,2,3,8]") {
            val result = makeArrayConsecutive(listOf(6, 2, 3, 8))
            it("should equal 3") {
                result shouldEqual 3
            }
        }
        on("[0,3]") {
            val result = makeArrayConsecutive(listOf(0, 3))
            it("should equal 2") {
                result shouldEqual 2
            }
        }
        on("[7,2,5,3]") {
            val result = makeArrayConsecutive(listOf(7,2,5,3))
            it("should equal 2") {
                result shouldEqual 2
            }
        }
        on("[0,10]") {
            val result = makeArrayConsecutive(listOf(0, 10))
            it("should equal 9") {
                result shouldEqual 9
            }
        }
        on("[4,7,10]") {
            val result = makeArrayConsecutive(listOf(4,7,10))
            it("should equal 2") {

            }
        }
    }
})