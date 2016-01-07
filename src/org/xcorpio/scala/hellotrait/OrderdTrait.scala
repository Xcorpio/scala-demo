package org.xcorpio.scala.hellotrait

object OrderdTrait extends Ordered[Int] {
  override def compare(that: Int)= {
    5 - that
  }
  def main(args: Array[String]): Unit = {
    println(OrderdTrait > 4)
  }
}