package org.xcorpio.scala.fortheimpatient.chapter5

/**
 * scala provides getter and setter method for every field.
 * scala generate a class for the JVM with a private field and getter and setter mythod
 */
class Person {
  /**
   *  public field. generate public getter and setter methods
   *  in scala, the getter and setter methods are called age and age_=
   */
  var age = 0
  val sex = "M" // val field will only generate getter method: sex() and modified with "final"
  private[this] var monny = 1 // only current object can access this field, no getter and setters method will be generated
}

object PropertiesWithGettersAndSetters {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.age = 2 //  calls p.age_=(21)
    println(p.age) //  calls the method p.age(), to see with your own eyes, compile this file
    //  and look at the Person.class bytecode with javap. the "=" symbol is translated to "$eq"
  }
}