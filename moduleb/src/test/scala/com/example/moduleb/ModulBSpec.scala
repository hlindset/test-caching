package com.example.moduleb

import org.scalatest._

class ModuleBSpec extends FlatSpec with Matchers {
  "The ModuleB object" should "say hello from ModuleB and hello from ModuleA" in {
    ModuleB.greeting shouldEqual "hello from ModuleB and hello from ModuleA"
  }
}
