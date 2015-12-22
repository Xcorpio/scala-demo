package org.xcorpio.scala.hello

import java.io.File

object HighLevelFunction {
  
  def main(args: Array[String]): Unit = {
    val filesHere = (new File(".")).listFiles
    
    def fileMatching(matcher: (String) => Boolean) = {
      for(file <- filesHere
          if matcher(file.getName))
        yield file
    }
    
    def filesEnding(query: String) = 
      fileMatching(_.endsWith(query))
    
    def filesContaining(query: String) =
      fileMatching(_.contains(query))
      
    def filesRegex(query: String) =
      fileMatching(_.matches(query))
      
    
  }
}