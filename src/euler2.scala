package Euler

import java.util.Calendar


object euler2 {

  def calcFibonacci(f: (Int, Int) => Int, cur : Int, next: Int, sum : Int) : Int = {
    if (cur > 4000000)
      sum
    else {
      calcFibonacci(f, next, cur + next, f(sum,next ))
    }
  }

}
