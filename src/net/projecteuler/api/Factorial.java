package net.projecteuler.api;

import java.math.BigInteger;

public class Factorial {

    private Factorial() {}

    public static long factorial(int n) {
        long result = 1;
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        for(int i = 1; i < n + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static BigInteger largeFactorial(int n) {
        if(n == 0)
            return BigInteger.ONE;
        if(n == 1)
            return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i < n + 1; i++) {
            result = result.multiply(BigInteger.valueOf((long) i));
        }
        return result;
    }
}
