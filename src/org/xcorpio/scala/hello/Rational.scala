package org.xcorpio.scala.hello

class Rational(n: Int, d: Int) {
  require(d!=0)
  println("Created " + n + "/" + d)
  private val g = gcd(n.abs, d.abs)
  val numerator = n / g
  val denominator = d / g
  
  def +(that: Rational) = 
    new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)
  
  def + (i: Int) = 
    new Rational(numerator + i * denominator, denominator)
  
  def *(that: Rational) = 
    new Rational(numerator * that.numerator, denominator * that.denominator)
  
  def this(n: Int) = this(n, 1)
  
  override def toString = n + "/" + d
  
  private def gcd(a: Int, b: Int): Int = 
    if(b==0) a else gcd(b, a % b)
}
object Rational {
  
  // 隐式转换要在同一作用域
  implicit def intToRational(x: Int) = 
    new Rational(x)
  
  def main(args: Array[String]): Unit = {
    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    println(x + y)
    println(x + x * y)
    println(x + 1)
    println(1 + y)
  }
}