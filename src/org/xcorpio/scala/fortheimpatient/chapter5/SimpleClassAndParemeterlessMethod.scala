package org.xcorpio.scala.fortheimpatient.chapter5

class Counter {
  private var value = 0 // you must initialize the field
  def increment() = value += 1 // methods are public by default
  def current = value // no '()' in definition
}
object SimpleClassAndParemeterlessMethod {
  def main(args: Array[String]): Unit = {
    val counter = new Counter
    /*
     * it is consider good style to use '()' for a mutator method(a method that
     * changes the object state), and drop the '()' for an accessor method(a method
     * that does not change the object state).
     */
    counter.increment
    counter.increment()
    // println(counter.current())  // no '()' in definition, class use this method without parentheses
    println(counter.current)
  }
}