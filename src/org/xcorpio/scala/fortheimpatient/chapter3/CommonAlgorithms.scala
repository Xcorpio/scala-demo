package org.xcorpio.scala.fortheimpatient.chapter3

import scala.collection.mutable.ArrayBuffer

object CommonAlgorithms {
  def main(args: Array[String]): Unit = {
    println(Array(2, 3, 4).sum)
    val ab = ArrayBuffer("Marry", "Dell", "Odersky")
    println(ab.min)
    println(ab.max)

    val sorted = ab.sorted
    println()
    for (i <- sorted) println(i)

    val descending = ab.sortWith(_ > _)
    println()
    for (i <- descending) println(i)

    val a = Array(4, 2, 5, 22)
    scala.util.Sorting.quickSort(a)
    println()
    for (i <- a) println(i)

    println(a)
    println(a.toString)
    println(a.mkString(" and "))
  }
}