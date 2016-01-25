package org.xcorpio.scala.hellopackage

class ImportUse {
  
}

abstract class Fruit (val name: String, val color: String)

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellow")
  val menu = List(Apple, Orange, Pear)
  
  def showFruit(fruit: Fruit) {
    import fruit._
    println(name + ":" + color)
  }
  
  
  def main(args: Array[String]): Unit = {
    showFruit(menu(0))
    
    // 直接引入包名
    import java.util
    util.regex.Pattern.compile("regex")
    // 重新定义包名
    import java.{util=>myutil}
    println(new myutil.Date)
    // 隐藏某个类型,将类型改名 '_'
    import myutil.{Date=>_,_}
    println(new myutil.Date)
  }
}

// 仅引用某些类
import Fruits.{Apple, Orange}
// =>重命名类型
import Fruits.{Apple=>MaIntosh, Orange}



