package Euler

import java.util.Calendar


object euler2 {

  def main (args: Array[String]) {

    val start  = Calendar.getInstance().getTimeInMillis
    print("Answer is: " + calcFibonacci(0,1))
    println(" answer took: " + (Calendar.getInstance().getTimeInMillis - start) + " milliseconds")

  /*  def addToSum(i: Int) = {
      if (i % 3 == 0 || i % 5 == 0) i else 0
    }*/
  }


  def calcFibonacci(cur : Int, next: Int) : Int = {
    if (cur > 100)
      next
    else {
      calcFibonacci(next, cur + next)
    }
  }

}
