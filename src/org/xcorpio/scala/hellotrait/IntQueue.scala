package org.xcorpio.scala.hellotrait

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = buf += x
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = super.put(x * 2)
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = super.put(x + 1)
}

object Main {
  def main(args: Array[String]): Unit = {
    val queueOne = new BasicIntQueue
    queueOne.put(1)
    queueOne.put(2)
    println(queueOne.get())
    
    val queueTwo = new BasicIntQueue with Doubling
    queueTwo.put(1)
    queueTwo.put(2)
    println(queueTwo.get())
    
    val queueThree = new BasicIntQueue with Incrementing 
    queueThree.put(1)
    queueThree.put(2)
    println(queueThree.get())
    
    val queueFour = new BasicIntQueue with Doubling with Incrementing
    queueFour.put(1)
    queueFour.put(2)
    println(queueFour.get())
    
    val queueFive = new BasicIntQueue with Incrementing with Doubling
    queueFive.put(1)
    queueFive.put(2)
    println(queueFive.get())
  }
}

