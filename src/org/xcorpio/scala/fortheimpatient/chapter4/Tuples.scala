package org.xcorpio.scala.fortheimpatient.chapter4

object Tuples {
  def main(args: Array[String]): Unit = {
    val t2 = ("hello", 4)
    println(t2 _1)
    println(t2._2)

    val t = (1, 3.14, "Odersky", "he", "she")
    val (one, two, three, _, _) = t
    println(two, three)
    
    val res = "Hello World".partition { _.isUpper }
    println(res)
  }
}