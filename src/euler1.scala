package Euler


object euler1 {

  def main (args: Array[String]) {

    println("Answer assignment 1 is: " + calcSum(addToSum, 1,0))
    println("Answer assignment 2 is: " + euler2.calcFibonacci(addEvenNumberToSum,0,1,0))

  }

  def addEvenNumberToSum(sum: Int, i: Int) = {
    if (i % 2 == 0) sum + i else sum
  }

  def addToSum(i: Int) = {
    if (i % 3 == 0 || i % 5 == 0) i else 0
  }

  def calcSum(f: Int => Int, i: Int, sum: Int) : Int = {
    if (i > 999)
      sum
    else {
      f(i) + calcSum(f, i + 1, sum)
    }
  }


}
