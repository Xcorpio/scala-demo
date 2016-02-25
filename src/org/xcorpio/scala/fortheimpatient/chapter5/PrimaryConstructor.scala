package org.xcorpio.scala.fortheimpatient.chapter5

import scala.beans.BeanProperty

/**
 * In Scala, every class has a primary constructor. The primary constructor is not defined with a 'this'
 * method. Instead, it is interwoven with the class definition.
 * 
 * 1. The parameters of the primary constructor are placed immediately after the class name.
 *    Parameters of the primary constructor turn into fields that are initialized with the construction parameters.
 */
class Dog(val name: String = "", @BeanProperty val age: Int = 0) {
  /**
   * 2. The primary constructor executes all statements in the class definition. The statement below is a part of the
   *    primary constructor.
   */
  println("executed by primary constructor.")
}

class Dog2 private {}  // private primary constructor

object PrimaryConstructor {
  def main(args: Array[String]): Unit = {
    val d1 = new Dog
    val d2 = new Dog("Tom", 1)
    println(d1.name, d2.getAge)
  }
}