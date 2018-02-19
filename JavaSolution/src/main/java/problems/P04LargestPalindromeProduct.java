package main.java.problems;

/**
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P04LargestPalindromeProduct {
    private static P04LargestPalindromeProduct problem = null;

    protected P04LargestPalindromeProduct() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 4: Largest Palindrome Product");

        int bound = 100;
        int pal = 0;

        for (int i = 999; i >= bound; i--) {
            for (int j = 999; j >= bound; j--) {
                int k = i * j;
                String reversed = new StringBuilder(String.valueOf(k)).reverse().toString();
                if (k == Integer.valueOf(reversed) && k > pal) {
                    pal = k;
                    bound = j;
                }
            }
        }

        System.out.println(pal);
    }
}
