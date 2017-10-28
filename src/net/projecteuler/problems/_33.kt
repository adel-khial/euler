package net.projecteuler.problems

import net.projecteuler.api.*

/**
 * A brute-force method, we check if the number have a digit in common (ignoring trivial cases),
 * if they do check the quotient of the two numbers and the quotient of the tzo numbers without the digits in common.
 */

fun main(args: Array<String>) {
    println(denominatorValue())
}

fun denominatorValue(): Int {
    var productA = 1
    var productB = 1
    for(a in 11..100) {
        for(b in 11..100) {
            if(a.toDouble()/b == rdQuotient(a, b)) {
                productA *= a
                productB *= b
            }
        }
    }
    return productB/gcd(productA, productB)
}

fun rdQuotient(a: Int, b: Int): Double {
    return when {
        a > b -> 0.0
        a == b -> 0.0
        a%10 == 0 || b%10 == 0 -> 0.0
        a.getDigit(0) == b.getDigit(0) -> a.getDigit(1).toDouble()/b.getDigit(1)
        a.getDigit(0) == b.getDigit(1) -> a.getDigit(1).toDouble()/b.getDigit(0)
        a.getDigit(1) == b.getDigit(0) -> a.getDigit(0).toDouble()/b.getDigit(1)
        a.getDigit(1) == b.getDigit(1) -> a.getDigit(0).toDouble()/b.getDigit(0)
        else -> 0.0
    }
}