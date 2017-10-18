package net.projecteuler.problems;

import net.projecteuler.api.GeneralMath;

import java.math.BigInteger;

/**
 * <p>EZ (Use Java lambdas to get the chars then map them to their numeric value.. sum.)</p>
 */
public class _20_LargeSumFactorial {

    public static void main(String[] args) {
        BigInteger result = GeneralMath.largeFactorial(100);
        System.out.println(result.toString().chars().map(Character::getNumericValue).sum());
    }
}
