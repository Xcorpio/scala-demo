package org.xcorpio.scala.hello

class Rational(n: Int, d: Int) {
  require(d!=0)
  println("Created " + n + "/" + d)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  
  def +(that: Rational) = 
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  
  def *(that: Rational) = 
    new Rational(numer * that.numer, denom * that.denom)
  
  def this(n: Int) = this(n, 1)
  
  override def toString = n + "/" + d
  
  private def gcd(a: Int, b: Int): Int = 
    if(b==0) a else gcd(b, a % b)
}
object Rational {
  def main(args: Array[String]): Unit = {
    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    println(x + y)
    println( x + x * y)
  }
}