object HigherOrderApp extends App {
  import FunctionsEx._

  // some examples to be copied in the console
  (1 to 10).map((x) => x * x).toList
  (1 to 5).map( (x: Int) => x.toString ).map(f1).toList
  (1 to 5).map( x => x.toString ).map(f1).toList
  (1 to 5).map(_.toString).map(f1).toList

  (1 to 5).map(_.toString).map(f1).foldLeft("z")(f5)
  (1 to 5).map(_.toString).map(f1).foldRight("z")(f5)

  // reverse a list
  def reverse(l: List[Int]): List[Int] = ???

  // arithmetics
  def largestInteger = ???

  def sumOddSquares = ???

  def collatz(n: Int): Int = ???

  def collatzConj = ???

  // strings
  import FactorialApp._

  def factStr = factorial(1000).toString

  def numZeroFact = ???

  def iLoveScala = ???

  def countSequence(sub: String): (String => Int) = ???

  def countSeq123Fact = ???

  def indexSequence(sub: String): (String => List[Int]) = ???

  def indexSeq123Fact = ???
}
