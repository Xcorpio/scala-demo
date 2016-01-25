package org.xcorpio.scala.helloclassobject

class ModifierScope {
  
}

package navigation {
  private[helloclassobject] class Navigator {
    protected[navigation] def useStartChart {}
    class LogOfJourney {
      private [Navigator] val distance = 100
    }
    private[this] var speed = 200
  }
  
  package launch {
      import navigation._
      object Vehicle {
          // scope 
          // private[launch] val guide = new Navigator
      }
  }
}