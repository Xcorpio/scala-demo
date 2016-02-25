package org.xcorpio.scala.fortheimpatient.chapter8_Inheritance

class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range: Int = 2
}

object ConstructionOrderAndEarlyDefinition {
  def main(args: Array[String]): Unit = {
    val ant = new Ant
    /**
     * you shouldn't rely on the value of a 'val' in the body of a constructor
     */
    println(ant.env.length) // print 0
  }
}