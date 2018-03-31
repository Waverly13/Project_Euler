package main.scala.problems

/**
  * Problem 4
  * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
  * is 9009 = 91 × 99.
  * Find the largest palindrome made from the product of two 3-digit numbers.
  */
object P4LargestPalindromeProduct {
  println("Problem 4: Largest Palindrome Product")

  var bound: Int = 100
  var pal: Int = 0

  for (i <- 999 to bound by -1) {
    for (j <- 999 to bound by -1) {
      val k: Int = i * j
      if (k == k.toString.reverse.toInt && k > pal) {
        pal = k
        bound = j
      }
    }
  }

  println (pal)

}
