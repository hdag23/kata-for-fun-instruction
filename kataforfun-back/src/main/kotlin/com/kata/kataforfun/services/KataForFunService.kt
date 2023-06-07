package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {

        if (replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber).isEmpty() && replaceByKataOrForOrFunWhenItContains3Or5or7(inputNumber).isEmpty())
            return inputNumber.toString()

        else
            return replaceByKataOrForWhenItIsDivisibleBy3Or5(inputNumber) + replaceByKataOrForOrFunWhenItContains3Or5or7(inputNumber)

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

    /**
     * convert into string when it contains 3 or 5 or 7 in order of appearance
     * @param inputNumber number to replace
     * @return replace string
     */
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

