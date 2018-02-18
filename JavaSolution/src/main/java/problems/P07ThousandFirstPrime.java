package main.java.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 */
public class P07ThousandFirstPrime {
    private static P07ThousandFirstPrime problem1 = null;

    protected P07ThousandFirstPrime() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 7: 10,001st Prime");

        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        primes.add(3L);
        Long possiblePrime = primes.get(primes.size() - 1) + 2;

        while (primes.size() < 10001) {
            Boolean isPrime = true;
                for (int i = 0; i <= primes.size(); i++) {
                    Long prime = primes.get(i);
                    if (prime > Math.sqrt(possiblePrime)) break;
                    else if (possiblePrime % prime == 0) {
                        isPrime = false;
                        break;
                    }
                }
            if (isPrime) primes.add(possiblePrime);
            possiblePrime += 2;
        }

        System.out.println(primes.get(primes.size() - 1));
    }
}
