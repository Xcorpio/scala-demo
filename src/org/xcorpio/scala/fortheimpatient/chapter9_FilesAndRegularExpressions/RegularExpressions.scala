package org.xcorpio.scala.fortheimpatient.chapter9_FilesAndRegularExpressions

object RegularExpressions {
  def main(args: Array[String]): Unit = {
    val numPattern = """[0-9]+""".r
    val result = numPattern.findAllIn("34 is 3345 to 06")
    for (num <- result) println(num)

    println(numPattern.replaceFirstIn("wer 55 66 er", "wuwu"))

    // Regular Expression Groups
    val numitemPattern = "([0-9]+) ([a-z]+)".r
    val numitemPattern(num, item) = "99 bottle"
    println(num)
    println(item)

    for (numitemPattern(num, item) <- numitemPattern.findAllIn("23 dd 33 sd 44 44 23 A 3 e")) println(num, item)
  }
}