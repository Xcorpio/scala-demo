package org.xcorpio.scala.util

import scala.util.parsing.json.JSON

object JsonRegexCompare {
  def main(args: Array[String]): Unit = {
    val text = "{\"logintype\":\"WEB001\",\"method\":\"applycreditbl1\",\"methodbody\":{\"applyamount\":\"10000\",\"finalcredit\": 100000,\"bankcard\":\"4096675282007589873\",\"bid\":4091297047897345024,\"flashid\":\"110\",\"ip\":\"45.192.212.95\",\"isstudent\":\"false\",\"name\":\"鲁明说\",\"phonenumber\":\"14241847887\",\"prcid\":\"610724197301010208\",\"projectid\":\"QUNAR001\",\"tid\":\"123456\"},\"productid\":\"QNR001\",\"sourcetype\":\"QN001\",\"reqid\":\"201602051014026162575241\"}"
    var startTime = System.nanoTime()
    val b = JSON.parseFull(text)
    b match {
      case Some(map: Map[String, Any]) => println(map.get("reqid"))
      case None => println("Parsing failed")
      case other => println("Unknown data structure: " + other)
    }
    println("json parse takes :" + (System.nanoTime() - startTime) + "ns")
    
    startTime = System.nanoTime()
    val result = text.substring(text.lastIndexOf("reqid")+8,text.length-2)
    println(result)
    println("string parse takes: " + (System.nanoTime() - startTime) + "ns")
    
    startTime = System.nanoTime()
    val reg = """"reqid":"([0-9]*)"""".r
    val s = reg.findFirstMatchIn(text).get.toString
    println(s.substring(9,s.length()-1))
    println("string parse takes: " + (System.nanoTime() - startTime) + "ns")
    
  }
}