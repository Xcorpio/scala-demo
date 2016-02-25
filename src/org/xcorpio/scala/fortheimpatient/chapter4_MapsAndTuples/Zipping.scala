package org.xcorpio.scala.fortheimpatient.chapter4_MapsAndTuples

object Zipping {
  def main(args: Array[String]): Unit = {
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    println(pairs.getClass)
    
    for ((x, y) <- pairs) println(x + ":" +  y)
    println(pairs.toMap)
  }
}