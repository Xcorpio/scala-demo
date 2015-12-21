package org.xcorpio.scala.hello

object HelloFirstClassFunction {
  
  def main(args: Array[String]): Unit = {
    val increase = (x: Int) => x + 1
    val increase2 = (x: Int) => {
      println("we")
      println(" are")
      println("  here")
      x+1
    }
    println(increase(3))
    println(increase2(4))
    
    val nums = List(1, 2, 3, 4, 5)
    nums.foreach(x => println(x - 1))
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for(x <- nums)
      println(x)
      
    val numsAfterFilterd = nums.filter { x => x > 3 }
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for(x <- numsAfterFilterd)
      println(x)
    
    var f = (x: Int) => x + 1
    f = (x) => x + 1
    f = x => x + 1
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(f(9))
    
    f = _ + 1
    println(f(9))
    
    val add = (_: Int) + (_: Int)
    println(add)
    println(add(2, 4))
    
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    nums.foreach(println _)
    nums.foreach(println)
    
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    val sum = 2 + (_: Int) + 2
    println(sum)
    println(sum(4))
    
    val sum2 = (_: Int) + 1 + (_: Int)
    println(sum2)
    println(sum2(1, 1))
  }
}