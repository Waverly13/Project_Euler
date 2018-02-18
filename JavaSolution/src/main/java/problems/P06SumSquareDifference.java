package main.java.problems;

/**
 * The sum of the squares of the first ten natural numbers is,
 *   1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *   (1 + 2 + ... + 10)^2 = 55POW2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum
 * is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class P06SumSquareDifference {
    private static P06SumSquareDifference problem1 = null;

    protected P06SumSquareDifference() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 6: Sum Square Difference");

        Long sumSquare = 0L;
        Long squareSum = 0L;

        for (int i = 1; i <= 100; i++) {
            sumSquare += i * i;
            squareSum += i;
        }

        Long r = squareSum*squareSum - sumSquare;
        System.out.println(r);
    }
}
