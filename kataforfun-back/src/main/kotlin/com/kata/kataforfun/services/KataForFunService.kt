package com.kata.kataforfun.services

import com.kata.kataforfun.enums.KataForFunEnum
import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {

        return if (applyDivisibleRule(inputNumber).isEmpty() && applyContainsRule(inputNumber).isEmpty())
            inputNumber.toString()
        else
            applyDivisibleRule(inputNumber) + applyContainsRule(inputNumber)

    }

    /**
     * convert into string when it is divisible by 3 or 5 sequentially
     * @param inputNumber number to replace
     * @return replace string
     */
    fun applyDivisibleRule(inputNumber: Int): String {
        var divisibleReplaceString: String = KataForFunEnum.EMPTY.value

        if(inputNumber % 3 == 0)
            divisibleReplaceString += KataForFunEnum.KATA.value
        if(inputNumber % 5 == 0)
            divisibleReplaceString += KataForFunEnum.FOR.value
        return divisibleReplaceString
    }

    /**
     * convert into string when it contains 3 or 5 or 7 in order of appearance
     * @param inputNumber number to replace
     * @return replace string
     */
    fun applyContainsRule(inputNumber: Int): String {
        var containsReplaceString: String = KataForFunEnum.EMPTY.value

        for(digit in inputNumber.toString()) {
            if(digit == '3') {
                containsReplaceString += KataForFunEnum.KATA.value
            }
            if(digit == '5') {
                containsReplaceString += KataForFunEnum.FOR.value
            }
            if(digit == '7') {
                containsReplaceString += KataForFunEnum.FUN.value
            }

        }
        return containsReplaceString
    }


}

