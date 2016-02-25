package org.xcorpio.scala.fortheimpatient.chapter1_TheBasics

object ArithmeticOperator {
  def main(args: Array[String]): Unit = {
    println(4 + 4)
    println(4.+(4))
    println(6 % 4)
    val bigi: BigInt = 1234567890
    val res = bigi * bigi * bigi
    println(res)
  }
}