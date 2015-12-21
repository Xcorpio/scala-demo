package org.xcorpio.scala.hello

object HelloClosure {
  
  def makeIncrease(more: Int) = (x: Int) => x + more
  
  def main(args: Array[String]): Unit = {
    val more: Int = 1
    val addMore = (x: Int) => x + more
    println(addMore(1))
    println(addMore)
    
    var a = 1
    val addA = (x: Int) => x + a
    println(addA(1))
    a = 2
    println(addA(1))
    println(Unit)
    
    val inc1 = makeIncrease(1)
    println(inc1)
    println(inc1(1))
    
    val inc99 = makeIncrease(99)
    println(inc99)
    println(inc99(1))
  }
}