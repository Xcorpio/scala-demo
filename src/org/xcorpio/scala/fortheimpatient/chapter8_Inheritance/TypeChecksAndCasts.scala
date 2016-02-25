package org.xcorpio.scala.fortheimpatient.chapter8_Inheritance

object TypeChecksAndCasts {
  def main(args: Array[String]): Unit = {
    println("Hello".isInstanceOf[String])
    println(null.isInstanceOf[String])
    println("s".asInstanceOf[String])
    println("23".asInstanceOf[AnyVal])
    println(null.asInstanceOf[String])
    println(classOf[String])
  }
}