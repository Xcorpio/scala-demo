package org.xcorpio.scala.fortheimpatient.chapter6_Objects

object TrafficLightColor extends Enumeration {
  val Red, Yellow, Green = Value

}

object Enumerations {
  def main(args: Array[String]): Unit = {
    import org.xcorpio.scala.fortheimpatient.chapter6_Objects.TrafficLightColor._
    println(Green)
    println(Yellow.id)

    for (i <- TrafficLightColor.values) println(i.id + ":" + i)
  }
}