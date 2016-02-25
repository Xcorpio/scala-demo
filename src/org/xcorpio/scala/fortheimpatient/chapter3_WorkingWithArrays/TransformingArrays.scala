package org.xcorpio.scala.fortheimpatient.chapter3_WorkingWithArrays

object TransformingArrays {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4)
    val b = for (i <- a) yield i * 2
    for (i <- b) println(i)

    println()
    val b2 = for (i <- a if i % 2 == 0) yield i * 2
    for (i <- b2) println(i)

    println()
    val b3 = a.filter { _ % 2 == 0 }.map { _ * 2 }
    for (i <- b3) println(i)

    val ab = a.toBuffer
    ab.remove(1)
    println()
    for (i <- ab) println(i)
  }
}