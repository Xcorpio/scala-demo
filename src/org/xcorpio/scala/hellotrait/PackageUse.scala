package org.xcorpio.scala.hellotrait {

  class PackageUse {

  }
}

package HH {
  class Hehe() {
    
  }
}

package launch {
  class Booster3
}
package rockets {
  
  package navigation {
    
    class Navigation {
      val map = new StartMap
    }
    
    class StartMap
    
    package launch {
      class Booster1
    }
  }
  
  package launch {
    class Booster2
  }
  
  class MissionControl {
    val booster1 = new navigation.launch.Booster1
    val booster2 = new launch.Booster2
    val booster3 = new _root_.launch.Booster3
  }
  
  class Ship {
    val nav = new navigation.Navigation
  }
  
  class Fleets {
    class Fleet {
      def addShip() = new Ship
    }
  }
}