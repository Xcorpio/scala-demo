package org.xcorpio.scala.hello

object Currying {
  def main(args: Array[String]): Unit = {
    
    def plainOldSum(x: Int, y: Int) = x + y
    
    def curriedSum(x: Int)(y: Int) = x + y
    
    println(plainOldSum(1, 1))
    println(curriedSum(1)(1))
    val c = curriedSum(1)_
    println(c)
    
    def first(x: Int) = (y: Int) => x + y
    val second = first(1)
    println(second)
    println(second(2))
    
    val onePlus = curriedSum(1)_
    println(onePlus(3))
  }
}