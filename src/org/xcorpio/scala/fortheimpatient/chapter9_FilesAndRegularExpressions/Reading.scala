package org.xcorpio.scala.fortheimpatient.chapter9_FilesAndRegularExpressions

object Reading {
  def main(args: Array[String]): Unit = {
    import scala.io.Source
    var source = Source.fromFile("pom.xml", "UTF-8")
    println(source.getClass)

    // lines
    val lineIterator = source.getLines()
    println(lineIterator)
    for (l <- lineIterator) println(l)

    // bytes
    source = Source.fromFile("pom.xml", "UTF-8")
    val lines = source.toArray
    println()
    println(lines.length)

    // string
    source = Source.fromFile("pom.xml", "UTF-8")
    val contents = source.mkString
    println()
    println(contents)

    // char
    source = Source.fromFile("pom.xml", "UTF-8")
    for (c <- source) println(c)
    source.close()
    
    // from url
    source = Source.fromURL("https://www.hao123.com/")
    println(source.mkString)
    
    // from string
    val source2 = Source.fromString("hello world")
    println(source2.mkString)
    
    val source3 = Source.stdin
    println(source3.mkString)
  }
}