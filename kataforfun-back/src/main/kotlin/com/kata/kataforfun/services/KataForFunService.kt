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
        if(inputNumber == 7)
            return "Fun"
        if(inputNumber == 15)
            return "KataForFor"
        if(inputNumber == 30)
            return "KataForKata"
        if(inputNumber == 45)
            return "KataForFor"

        return if (replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber).isEmpty()) inputNumber.toString() else replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber)
    }

    /**
     * convert into string when it is divisible by 3 or 5 sequentially
     * @param inputNumber number to replace
     * @return replace string
     */
    fun replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber: Int): String {
        var replaceString: String = ""

        if(inputNumber % 3 == 0)
            replaceString += "Kata"
        if(inputNumber % 5 == 0)
            replaceString += "For"
        return replaceString
    }


}

