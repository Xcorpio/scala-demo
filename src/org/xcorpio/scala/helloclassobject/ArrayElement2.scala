package org.xcorpio.scala.helloclassobject

// 参数化成员变量,加val,var,把参数和成员变量定义到一起，避免ArrayElement中的代码
class ArrayElement2(val contents: Array[String]) extends Element

class Cat {
  val dagerous = false
}

class Tiger(override val dagerous: Boolean, private val age: Int) extends Cat

object ArrayElement2 {
  def main(args: Array[String]): Unit = {
    val ae = new ArrayElement2(Array("one", "two", "three"))
    println(ae.width)
  }
}