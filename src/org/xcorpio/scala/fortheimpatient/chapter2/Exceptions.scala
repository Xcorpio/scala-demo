package org.xcorpio.scala.fortheimpatient.chapter2

object Exceptions {
  def main(args: Array[String]): Unit = {
    println(sqrt(3.3))
    
    try {
      throw new IllegalArgumentException("throw exception test.")
    } catch {
      case ex: Throwable => ex.printStackTrace()
    } finally {
      println("finally.")
    }
    
    println(sqrt(-3))
  }

  def sqrt(x: Double) = {
    if (x > 0) scala.math.sqrt(x)
    else throw new IllegalArgumentException("value should not be negative.")
  }
}
