package com.example.modulea

object ModuleA extends ModuleAGreeting with App {
  println(greeting)
}

trait ModuleAGreeting {
  lazy val greeting: String =
    "hello from ModuleA"
}
