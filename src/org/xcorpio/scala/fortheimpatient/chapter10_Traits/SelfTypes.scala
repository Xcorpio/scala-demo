package org.xcorpio.scala.fortheimpatient.chapter10_Traits

/**
 * When a trait starts out with
 * {{{
 * 		this: Type =>
 * }}}
 * then it can only be mixed into a subclass of the given type.
 * Note that the trait doesn't extends a 'Exception' class. Instead, it has a self type
 * 'Exception'. That means it can only be mixed into subclasses of Exception.
 */

trait LoggedException extends Logger {
  this: Exception =>
  def log(msg: String) { println(msg) }
  def log() { println(getMessage) }
}

/**
 * Self types can also handle 'structure types'--types merely specify the methods that a class must have, without
 * naming the class.
 * The class can mix in any class that has a 'getMessage' method.
 */

trait LoggedException2 extends Logger {
  this: { def getMessage(): String } =>
  def log(msg: String) { println(msg) }
}

class TTT extends Exception with LoggedException
class TTTT extends LoggedException2 {
  def getMessage() = ""
}

object SelfTypes {

}