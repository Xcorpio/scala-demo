package org.xcorpio.scala.helloclassobject

class ArrayElement(conts: Array[String]) extends Element{
  //def contents: Array[String] = conts
  // 可以使用成员变量重载无参数列表的方法
  val contents = conts
  override def demo: Unit = println("ArrayElement's implementation is invoked~~")
}

object ArrayElement {
  def main(args: Array[String]): Unit = {
    val ae:Element = new ArrayElement(Array("one", "two", "three"))
    println(ae.width)
  }
}