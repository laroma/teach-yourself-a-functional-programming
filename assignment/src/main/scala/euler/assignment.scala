package euler

object ProjectEuler {
  /*
   * Even Fibonacci numbers
   *
   * Each new term in the Fibonacci sequence is generated by adding the previous
   * two terms. By starting with 1 and 2, the first 10 terms will be:
   *
   * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   *
   * By considering the terms in the Fibonacci sequence whose values do not
   * exceed four million, find the sum of the even-valued terms.
   */
  def problem2(): Int = ???

  /*
   * Largest palindrome product
   *
   * A palindromic number reads the same both ways. The largest palindrome made
   * from the product of two 2-digit numbers is 9009 = 91 × 99.
   *
   * Find the largest palindrome made from the product of two 3-digit numbers.
   *
   */
  def problem4(): Int = ???

  /*
   * Special Pythagorean triplet
   *
   * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
   * which, a^2 + b^2 = c^2
   *
   * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
   *
   * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
   * Find the product abc.
   */
  def problem9(): Int = ???


  /*
   * Maximum path sum I
   *
   * By starting at the top of the triangle below and moving to adjacent numbers
   * on the row below, the maximum total from top to bottom is 23.
   *
   *      3
   *     7 4
   *    2 4 6
   *   8 5 9 3
   *
   * That is, 3 + 7 + 4 + 9 = 23.
   *
   * Find the maximum total from top to bottom of the given triangle with 15
   * rows:
   */
  def problem18(triangle: List[List[Int]]): Int = ???

  /*
   * Maximum path sum II
   *
   * By starting at the top of the triangle below and moving to adjacent numbers
   * on the row below, the maximum total from top to bottom is 23.
   *
   *    3
   *   7 4
   *  2 4 6
   * 8 5 9 3
   *
   * That is, 3 + 7 + 4 + 9 = 23.
   *
   * Find the maximum total from top to bottom in the given triangle with
   * one-hundred rows.
   *
   * NOTE: This is a much more difficult version of Problem 18. It is not
   * possible to try every route to solve this problem, as there are 2^99
   * altogether! If you could check one trillion (10^12) routes every second it
   * would take over twenty billion years to check them all. There is an
   * efficient algorithm to solve it. ;o)
   */
  def problem67(triangle: List[List[Int]]): Int = ???
}