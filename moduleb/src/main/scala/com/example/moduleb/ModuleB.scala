package com.example.moduleb

import com.example.modulea.ModuleA

object ModuleB extends ModuleBGreeting with App {
  println(greeting)
}

trait ModuleBGreeting {
  lazy val greeting: String =
    s"hello from ModuleB and ${ModuleA.greeting}"
}
