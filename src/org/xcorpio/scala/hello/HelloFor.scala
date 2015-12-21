package org.xcorpio.scala.hello

import java.io.File

object HelloFor {
  
  def listAllFiles() : Unit = {
    val filesHere = (new File(".")).listFiles
    for(file <- filesHere
        if file.isFile
        if file.getName.endsWith(".md"))
      println(file)
  }
  
  def enumerateRange(): Unit = {
    println("hello mr.zheng")
  }
  
  def fileLines(file: File) = {
    scala.io.Source.fromFile(file).getLines().toList
  }
  
  def grep(pattern: String): Unit = {
    val fileHere = (new File(".")).listFiles
    for(file <- fileHere
        if file.getName.endsWith(".md") && file.isFile();
        line <- fileLines(file)
        if line.trim().matches(pattern)
    ) println(file + " : " + line.trim)
  }
  
  def grep2(pattern: String): Unit = {
    val fileHere = (new File("./src/org/xcorpio/scala/hello")).listFiles
    for{
      file <- fileHere
      if file.getName.endsWith(".scala") && file.isFile
      line <- fileLines(file)
      trimed = line.trim
      if trimed.matches(pattern)
    } println(file + " : " + trimed)
  }
  
  def scalaFiles() = {
    val fileHere = (new File("./src/org/xcorpio/scala/hello")).listFiles
    for(
        file <- fileHere if file.getName.endsWith(".scala")
    ) yield file
  }
  
  def main(args: Array[String]): Unit = {
    listAllFiles()
    enumerateRange()
    grep(".*")
    grep2(".*println.*")
    val scalafiles = scalaFiles()
    for(file <- scalafiles)
      println(file)
  }
}