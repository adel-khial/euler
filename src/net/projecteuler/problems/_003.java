package net.projecteuler.problems;

import net.projecteuler.math.Primes;

public class _003 {

    public static void main(String[] args) {
        long check = 600851475143L;
        long largestFactor = 1;

        for(long l = 6; l < Math.sqrt(check); l++) {
            if(Primes.isPrime(l) && check%l == 0) {
                largestFactor = l;
            }
        }
        System.out.println(largestFactor);
    }
}
