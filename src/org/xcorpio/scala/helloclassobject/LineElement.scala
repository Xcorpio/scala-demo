package org.xcorpio.scala.helloclassobject

// 调用基类构造函数
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
  override def demo: Unit = println("LineElement's implementation is invoked~~~")
}

object LineElement {
  def main(args: Array[String]): Unit = {
    val le = new LineElement("ssss")
    println(le.contents.size)
    val ae:Element = new ArrayElement(Array("One", "Two"))
    val ae2: Element = new ArrayElement2(Array("One", "Two"))
    le.demo
    ae.demo
    ae2.demo
  }
}