package org.xcorpio.scala.fortheimpatient.chapter5_Classes

class Cat {
  private var name = ""
  private var age = 0

  /**
   * 1. the auxiliary constructors are called 'this'.
   * 2. each auxiliary constructor must start with a call to previously defined auxiliary constructor or the primary
   * constructor
   */
  def this(name: String) { // an auxiliary constructor
    this() // calls primary constructor
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name) // calls previously auxiliary constructor
    this.age = age
  }
}
object AuxiliaryConstructors {
  def main(args: Array[String]): Unit = {
    val c1 = new Cat
    val c2 = new Cat("Tom")
    val c3 = new Cat("Tom", 7)
    println(c1, c2, c3)
  }
}