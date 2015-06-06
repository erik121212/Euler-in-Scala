package Euler

import java.util.Calendar

object euler1 {

  def main (args: Array[String]) {

    var start  = Calendar.getInstance().getTimeInMillis
    print("Answer assignment 1 is: " + calcSum(addToSum, 1,0))
    println(" answer took: " + (Calendar.getInstance().getTimeInMillis - start) + " milliseconds")

    start  = Calendar.getInstance().getTimeInMillis
    print("Answer assignment 2 is: " + calcSum(addToSum, 1,0))
    euler2.calcFibonacci(0,1);
    println(" answer took: " + (Calendar.getInstance().getTimeInMillis - start) + " milliseconds")
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
