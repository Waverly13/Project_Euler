package main.java.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class P03LargestPrimeFactor {
    private static P03LargestPrimeFactor problem1 = null;

    protected P03LargestPrimeFactor() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 3: Largest Prime Factor");

        Long num = 600851475143L;
        List<Integer> primes = new ArrayList<>();

        while (num %2 == 0) {
            primes.add(2);
            num = num /2;
        }

        for (int i = 3; i <= (int)(Math.floor(Math.sqrt(num)));
            i += i % 2 != 0 ? 1 : 3) {
            if (num % i == 0) {
                num = num / i;
                primes.add(i);
            }
        }

        System.out.println(primes.get(primes.size() - 1));
    }
}
