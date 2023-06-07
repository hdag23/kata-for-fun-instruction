package com.kata.kataforfun.services

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KataForFunServiceTests {
    @Test
    fun shouldReturn1IfTheInputNumberIs1() {
        Assertions.assertEquals("1", KataForFunService().convertNumber(1))
    }

    @Test
    fun shouldReturn2IfInputNumberIs2() {
        Assertions.assertEquals("2", KataForFunService().convertNumber(2))
    }

    @Test
    fun shouldReturnKataKataIfInputNumberIs3() {
        Assertions.assertEquals("KataKata", KataForFunService().convertNumber(3))
    }

    @Test
    fun shouldReturn4IfInputNumberIs4() {
        Assertions.assertEquals("4", KataForFunService().convertNumber(4))
    }

    @Test
    fun shouldReturnForForIfInputNumberIs5() {
        Assertions.assertEquals("ForFor", KataForFunService().convertNumber(5))
    }

    @Test
    fun shouldReturnKataIfInputNumberIs6() {
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(6))
    }

    @Test
    fun shouldReturnFunIfInputNumberIs7() {
        Assertions.assertEquals("Fun", KataForFunService().convertNumber(7))
    }

    @Test
    fun shouldReturn8IfInputNumberIs8() {
        Assertions.assertEquals("8", KataForFunService().convertNumber(8))
    }

    @Test
    fun shouldReturnKataIfInputNumberIs9() {
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(9))
    }

    @Test
    fun shouldReturnForIfInputNumberIs10() {
        Assertions.assertEquals("For", KataForFunService().convertNumber(10))
    }

    @Test
    fun shouldReturnKataForIfInputNumberIs0() {
        Assertions.assertEquals("KataFor", KataForFunService().convertNumber(0))
    }
}