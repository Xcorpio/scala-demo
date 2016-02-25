package org.xcorpio.scala.fortheimpatient.chapter3_WorkingWithArrays

object FixedLengthArrays {
  def main(args: Array[String]): Unit = {
    val nums = new Array[Int](10)
    // an array of ten integers, all initialized with zero
    println(nums(9))
    val a = new Array[String](10)
    // a string array of ten elements, all initialize with null
    println(a(0))
    
    val s = Array("hello", "world")
    println(s(0))
    s(1) = "god"
    println(s(0), s(1))
  }
}