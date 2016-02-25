package org.xcorpio.scala.fortheimpatient.chapter4

object ConstructingMap {
  def main(args: Array[String]): Unit = {
    val scoreImmutable = Map("Alice" -> 10, "Bob" -> 20, "Dell" -> 5)  //  construct a immutable map
    println(scoreImmutable)
    val scoreMutable = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Dell" -> 5)  //  construct a immutable map
    println(scoreMutable)
    val pair1 = "hel" -> 4
    println(pair1)
    val pair2 = ("hi", 5)
    println(pair2)
    
    // accessing map values
    val bobScore = if (scoreImmutable.contains("Bob")) scoreImmutable("Bob") else 0
    println(bobScore)
    println(scoreImmutable.getOrElse("Bob", 3))
    val map = Map(("e",3), ("f", 4), ("e", 4))
    println(map("e"))
    
    // updating map values, you cann't update immutable map
    //scoreImmutable("Bob") = 4  // error immutable
    scoreMutable("Bob") = 4
    
    //scoreImmutable += ("T", 7)
    scoreMutable += ("T" -> 8, "F" -> 0)
    println(scoreMutable("T"))
    scoreMutable -= "Bob"
    println(scoreMutable)
   
    val newMap = scoreImmutable + ("T" -> 1, "F" -> 0)
    println(newMap)
    
    for ((k, v) <- newMap) {
      println(k + ":" + v + " ")
    }
    println(newMap.keySet)
    println(newMap.values)
    
    val revesemap = for ((v, k) <- newMap) yield (k, v)
    println(revesemap)
    
    // sorted maps
    val sortedmap = scala.collection.immutable.SortedMap("Bob" -> 4, "Alice" -> 5, "Tom" -> 9)
    println("sortedmap:" + sortedmap)
  }
}