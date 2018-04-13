package com.lenois.kotliniscool

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class AdjacentElementsProductSpek : Spek({
given("A call to adjecentElementsProduct"){
    on("[3,6,-2,-5,7,3]"){
        val result = adjacentElementsProduct(listOf(3,6,-2,-5,7,3))
        it("should return 21"){
            result shouldEqual 21
        }
    }
}
})