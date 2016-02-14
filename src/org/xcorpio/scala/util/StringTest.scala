package org.xcorpio.scala.util

object StringTest {
  def main(args: Array[String]): Unit = {
    val s = """{"sourcetype":"ZCP001","logintype":"WEB001","productid":"DLQ001","reqid":"201602141029518530199547","reqversion":"null","method":"applycreditbl1","status":0,"msg":"授信申请成功","methodbody":{"randomcredit":0.0,"denyreason":"","projectid":"NUOMI01","verifytype":0,"errorcode":"","credit":100000.0,"bid":4571761175682514944}}"""
    val result = s.contains(""""status":0""")
    println(result)
  }
}