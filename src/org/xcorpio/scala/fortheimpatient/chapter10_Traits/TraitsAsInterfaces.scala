package org.xcorpio.scala.fortheimpatient.chapter10_Traits

import java.lang.Cloneable
import java.io.Serializable

trait Logger {
  /**
   * As abstract method. Note that you need not declare the method as 'abstract'
   * -- an unimplemented method in a trait is automatically abstract
   */
  def log(msg: String)
}

/**
 * It may seem odd that use 'extends' before the fist trait but 'with' before all the others.
 * But it's not the way scala thinks, in scala 'Logger with Cloneable with Serializable' is the entity that the class
 * extends.
 */
class ConsoleLogger extends Logger with Cloneable with Serializable { // Use extends, not implements
  def log(msg: String) { println(msg) } // You need not supply the 'override' keyword when overriding an abstract method of a trait
}