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

    @Test
    fun shouldReturnKataOnlyBecauseItIsAMultipleOf3() {
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(12))
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(18))
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(21))
    }

    @Test
    fun shouldReturnForOnlyBecauseItIsAMultipleOf5() {
        Assertions.assertEquals("For", KataForFunService().convertNumber(20))
        Assertions.assertEquals("For", KataForFunService().convertNumber(40))
        Assertions.assertEquals("For", KataForFunService().convertNumber(80))
    }

    @Test
    fun shouldReturnKataForOnlyBecauseItIsAMultipleOf3And5() {
        Assertions.assertEquals("KataFor", KataForFunService().convertNumber(60))
        Assertions.assertEquals("KataFor", KataForFunService().convertNumber(90))
        Assertions.assertEquals("KataFor", KataForFunService().convertNumber(120))
    }

    @Test
    fun shouldNotReturnKataForEvenIfItIsAMultipleOf3And5() {
        Assertions.assertFalse("KataFor".equals(KataForFunService().convertNumber(15)))
        Assertions.assertFalse("KataFor".equals(KataForFunService().convertNumber(30)))
        Assertions.assertFalse("KataFor".equals(KataForFunService().convertNumber(45)))
    }

    @Test
    fun shouldReturnKataOnlyBecauseItContains3() {
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(13))
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(23))
        Assertions.assertEquals("Kata", KataForFunService().convertNumber(38))
    }

    @Test
    fun shouldReturnForOnlyBecauseItContains5() {
        Assertions.assertEquals("For", KataForFunService().convertNumber((52)))
        Assertions.assertEquals("For", KataForFunService().convertNumber((56)))
        Assertions.assertEquals("For", KataForFunService().convertNumber((151)))
    }

    @Test
    fun shouldReturnFunOnlyBecauseItContains7() {
        Assertions.assertEquals("Fun", KataForFunService().convertNumber((17)))
        Assertions.assertEquals("Fun", KataForFunService().convertNumber((76)))
    }

    @Test
    fun shouldReturnKataKataOnlyBecauseItIsDivisibleBy3AndContains3() {
        Assertions.assertEquals("KataKata", KataForFunService().convertNumber((63)))
        Assertions.assertEquals("KataKata", KataForFunService().convertNumber((36)))
    }

    @Test
    fun shouldReturnForForOnlyBecauseItIsDivisibleBy5AndContains5() {
        Assertions.assertEquals("ForFor", KataForFunService().convertNumber((50)))
        Assertions.assertEquals("ForFor", KataForFunService().convertNumber((25)))
    }



}