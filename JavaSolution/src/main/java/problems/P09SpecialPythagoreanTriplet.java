package main.java.problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class P09SpecialPythagoreanTriplet {
    private static P09SpecialPythagoreanTriplet problem = null;

    protected P09SpecialPythagoreanTriplet() {
        // no instantiation
    }

    public static void solveProblem() {
        System.out.println("Problem 9: Special Pythagorean Triplet");

        Integer sum = 1000;
        Integer product = 0;

        for (int a = 1; a <= sum/2; a++) {
            for (int b = a+1; b <= sum/2; b++) {
                Integer k = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
                Double possibleC = Math.sqrt(k);
                if (a + b + possibleC > sum) break;
                else if (Math.floor(possibleC) == possibleC && a + b + possibleC == sum) {
                    product = a * b * (int)Math.floor(possibleC);
                }
            }
        }

        System.out.println(product);
    }
}
