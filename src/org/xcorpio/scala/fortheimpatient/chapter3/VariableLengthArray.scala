package org.xcorpio.scala.fortheimpatient.chapter3

object VariableLengthArray {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val b = ArrayBuffer[Int]()
    println(b, b.hashCode)
    b += 1
    b.append(2)
    b += (4, 5, 6)  // add multiple elements at the end by enclosing them in parentheses
    b ++= Array(8, 13, 21)  // you can append any collection with the ++= operator
    b trimEnd 5
    println(b, b.hashCode)
    val a = b.toArray
    println(a)
    println(a.toBuffer)
  }
}