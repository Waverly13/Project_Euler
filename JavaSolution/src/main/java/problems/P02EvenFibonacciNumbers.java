package main.java.problems;

/**
 * Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
 * the first 10 terms will be:
 *     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of
 * the even-valued terms.
 */
public class P02EvenFibonacciNumbers {
    private static P02EvenFibonacciNumbers problem2 = null;

    protected P02EvenFibonacciNumbers() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 2: Even Fibonacci Numbers");

        Long fib = 0L;
        Long sum = 0L;
        Long subOne = 0L;
        Long subTwo = 1L;

        while (fib < 4000000) {
            if(fib % 2 == 0) sum = sum + fib;
            fib = subOne + subTwo;
            subOne = subTwo;
            subTwo = fib;
        }

        System.out.println(sum);
    }
}