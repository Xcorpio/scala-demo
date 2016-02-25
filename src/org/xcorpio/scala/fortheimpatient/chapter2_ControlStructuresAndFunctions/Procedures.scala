package org.xcorpio.scala.fortheimpatient.chapter2_ControlStructuresAndFunctions

object Procedures {
  def main(args: Array[String]): Unit = {
    println(Unit)
    println(box("Hello"))
    println(box2("Hello"))
  }
  
  // without a preceding "=" symbol, then the return value is Unit. such a function is called a procedure
  def box(s: String) { // no "="
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }
  
  def box2(s: String): Unit = {
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }
}