package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        if(inputNumber == 0)
            return "KataFor"
        if(inputNumber == 3)
            return "KataKata"
        if(inputNumber == 5)
            return "ForFor"
        if(inputNumber == 6)
            return "Kata"
        if(inputNumber == 7)
            return "Fun"
        if(inputNumber == 9)
            return "Kata"
        if(inputNumber == 10)
            return "For"
        return inputNumber.toString()
    }

}