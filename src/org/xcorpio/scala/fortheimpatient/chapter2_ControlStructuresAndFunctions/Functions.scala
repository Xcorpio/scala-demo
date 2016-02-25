package org.xcorpio.scala.fortheimpatient.chapter2_ControlStructuresAndFunctions

object Functions {
  def main(args: Array[String]): Unit = {
    println(fac(5))
    println(fac2(5))
    println(fac3(5))
  }
  
  def fac(n: Int) = {
    var r = 1
    for (i <- 1.to(n)) r = r * i
    r
  }
  
  // with a recursive function, you must specify the return type
  // without the return type, the compiler couldn't know the n * fac2(n-1) is an Int
  // it's not a tail recursion
  def fac2(n: Int): Int = if (n <= 0) 1 else n * fac2(n - 1)
  
  // tail recursion version
  def fac3(n: Int, res: Int = 1): Int = {
    if (n <= 0) {
      res
    } else {
      fac3(n - 1, n * res)
    }
  }
}