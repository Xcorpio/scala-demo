package org.xcorpio.scala.hello

class Rational(n: Int, d: Int) {
  require(d!=0)
  println("Created " + n + "/" + d)
  
  override def toString = n + "/" + d
}
object Rational {
  def main(args: Array[String]): Unit = {
    val r = new Rational(1, 0)
    println(r)
  }
}