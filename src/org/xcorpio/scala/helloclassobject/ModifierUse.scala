package org.xcorpio.scala.helloclassobject

class ModifierUse {
  
}

class Outer {
  class Inner {
    private def f = println("inner private function")
    protected def fp = println("innner protected function")
    class InnerMost {
      f
      fp
    }
    
  }
  
  class SubInner extends Inner {
      fp
  }
  
  class NonInner {
    // fp is not accessible
    // (new Inner).fp
  }
  // error: can't access 
  // (new Inner).f()
}

object Outer {
  def main(args: Array[String]): Unit = {
    val outer = new Outer
    val inner = new outer.Inner
    new inner.InnerMost
  }
}