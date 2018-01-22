package scala.app

object GreetingsApplication extends App {

  def greet(name : String) : Unit = println("Hello " + name)

  val name = "Adam"

  greet(name)

}
