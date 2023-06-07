package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {

        if(inputNumber == 3)
            return "KataKata"
        if(inputNumber == 5)
            return "ForFor"

        if(inputNumber == 15)
            return "KataForFor"
        if(inputNumber == 30)
            return "KataForKata"
        if(inputNumber == 45)
            return "KataForFor"

        if (replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber).isNotEmpty())
            return replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber)

        if (replaceByKataOrForOrFunWhenItContains3Or5or7(inputNumber).isNotEmpty())
            return replaceByKataOrForOrFunWhenItContains3Or5or7(inputNumber)

        else
            return inputNumber.toString()
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

    fun replaceByKataOrForOrFunWhenItContains3Or5or7(inputNumber: Int): String {
        var containsReplaceString: String = ""

        for(digit in inputNumber.toString()) {
            if(digit == '3') {
                containsReplaceString += "Kata"
            }
            if(digit == '5') {
                containsReplaceString +="For"
            }
            if(digit == '7') {
                containsReplaceString +="Fun"
            }

        }
        return containsReplaceString
    }


}

