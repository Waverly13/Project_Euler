package main.java.problems;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class P05SmallestMultiple {
    private static P05SmallestMultiple problem = null;

    protected P05SmallestMultiple() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 5: Smallest Multiple");

        int i = 20;
        int increase = i;
        int multiple = i;

        while (i >= 1) {
            if (multiple % i == 0){
                increase = multiple;
                i -= 1;
            } else multiple += increase;
        }

        System.out.println(multiple);
    }
}