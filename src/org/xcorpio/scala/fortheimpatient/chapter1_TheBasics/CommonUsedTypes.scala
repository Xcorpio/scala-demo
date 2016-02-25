package org.xcorpio.scala.fortheimpatient.chapter1_TheBasics

import scala.collection.immutable.Range

object CommonUsedTypes {
  def main(args: Array[String]): Unit = {
    val res = "hello".intersect("lo")
    println(res)
    println(99.6.toDouble)
    println(44.22.toDegrees)
    println(1.to(10))
    println(1 until 10)
    
    val range1 = new Range(1, 10, 2)
    println(range1)
  }
}