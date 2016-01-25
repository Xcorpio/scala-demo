package org.xcorpio.scala.hellotrait

class Animal
trait HasLegs
class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
  override def philosophize(): Unit = {
    println("It is not easy being " + toString + "!")
  }
}

object Frog {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    frog.philosophize()
    println(frog)
  }
}