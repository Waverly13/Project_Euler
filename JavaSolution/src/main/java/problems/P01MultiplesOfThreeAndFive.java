package main.java.problems;

/**
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class P01MultiplesOfThreeAndFive {
    private static P01MultiplesOfThreeAndFive problem1 = null;

    protected P01MultiplesOfThreeAndFive() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 1: Multiples of 3 and 5");

        int count = 0;

        for (int i = 0; i <= 999; i++) {
            if (i % 3 == 0 || i % 5 == 5) count = count+i;
        }

        System.out.println(count);
    }
}
