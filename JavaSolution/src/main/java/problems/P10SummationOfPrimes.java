package main.java.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class P10SummationOfPrimes {
    private static P10SummationOfPrimes problem = null;

    protected P10SummationOfPrimes() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 10: Summation Of Primes");

        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        Long summation = primes.stream().mapToLong(a -> a.longValue()).sum();
        Integer possiblePrime = primes.get(primes.size() - 1) + 2;

        Integer count = 0;
        while (possiblePrime < 2000000) {
            Boolean isPrime = checkIfPrime(possiblePrime, primes);
            if (isPrime) {
                primes.add(possiblePrime);
                summation += possiblePrime;
            }
            if (count < 4) {
                possiblePrime += 2;
                count += 1;
            } else {
                possiblePrime +=4;
                count = 1;
            }
        }

        System.out.println(summation);
    }

    private static Boolean checkIfPrime(Integer possiblePrime, List<Integer> primes) {
        Boolean isPrime = true;
        for (int i : primes) {
            if (i > Math.sqrt(possiblePrime)) break;
            else if (possiblePrime % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
