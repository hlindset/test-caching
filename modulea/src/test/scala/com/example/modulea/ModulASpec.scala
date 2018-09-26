package com.example.modulea

import org.scalatest._

class ModuleASpec extends FlatSpec with Matchers {
  "The ModuleA object" should "say hello from ModuleA" in {
    ModuleA.greeting shouldEqual "hello from ModuleA"
  }
}
