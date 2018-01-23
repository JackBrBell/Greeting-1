package scala.app

import scala.io.StdIn


class Person(name : String) {

  def speak() : String = {
    if (name == "adam") {
      "You don't get a hello."
    } else {
      "Hello " + name
    }
  }

}

object Prompt {

  def ask(message : String) : String = StdIn.readLine(message)

}

object GreetingsApplication extends App {

  val n : String = Prompt.ask("What is your name? ")

  val p : Person = new Person(n)

  println(p.speak())

}
