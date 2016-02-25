package org.xcorpio.scala.fortheimpatient.chapter4

object InteroperatingWithJava {
  def main(args: Array[String]): Unit = {
    import scala.collection.JavaConversions.mapAsScalaMap
    val scores: scala.collection.mutable.Map[String, Int] =
      new java.util.TreeMap[String, Int]
    scores.put("Bob", 10)
    scores.put("Alice", 10)
    println(scores)
    
    import scala.collection.JavaConversions.propertiesAsScalaMap
    val props: scala.collection.Map[String, String] = System.getProperties
    println(props.getClass)
    println(props("java.runtime.name"))
  }
}