package com.lenois.kotliniscool

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class InterestingPolygonSpek : Spek({
    given("the interesting polygon function") {
        on("1") {
            val result = interestingPolygon(1)
            it("should return 1") {
                result shouldEqual 1
            }
        }
        on("2") {
            val result = interestingPolygon(2)
            it("should return 5") {
                result shouldEqual 5
            }
        }
        on("3") {
            val result = interestingPolygon(3)
            it("should return 13") {
                result shouldEqual 13
            }
        }
        on("10") {
            val result = interestingPolygon(10)
            it("should return 181") {
                result shouldEqual 181
            }
        }
        on("11") {
            val result = interestingPolygon(11)
            it("should return 221") {
                result shouldEqual 221
            }
        }
        on("89") {
            val result = interestingPolygon(89)
            it("should return 15665") {
                result shouldEqual 15665
            }
        }
    }
})
