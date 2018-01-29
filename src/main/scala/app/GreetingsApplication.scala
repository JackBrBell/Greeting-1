package scala.app

import scala.app.models.{CashISASavingsAccount, Person, SavingsAccount}
import scala.io.StdIn

object Prompt {

  def ask(message : String) : String = StdIn.readLine(message)

}

object GreetingsApplication extends App {

  val savingsAccount = new SavingsAccount("12345", 100.00)
  val savingsPlus100 = savingsAccount.deposit(100.00)

  val name : String = Prompt.ask("What is your name? ")
  val age : String = Prompt.ask("How old are you? ")

  val p : Person = new Person(name, age.toInt)
  println(p.speak())

  val child = new Person("David")

  val p2 = new Person("Adam", "Conder")


  /**
    * Create a second bank account of type CashISA
    * Deposit, withdraw and assign to a person
    */
  val cashISA = new CashISASavingsAccount("1234566", 0.00, depositThreshold = 300.00)
  val isaDeposited = cashISA.deposit(1000.00)
  val withdrawFromISA = isaDeposited.withdraw(200.00)
  val personWithCashISA = new Person("Loyal customer", 56, withdrawFromISA)

  // Speak the balance of the cash ISA
  println(personWithCashISA.speak())


  /**
    * Super loyal customer
    */
  val superAccount = new CashISASavingsAccount("1234566", 0.00, depositThreshold = 1000.00).deposit(1000.00).withdraw(300.00)

  val superPersonWithISA = new Person("Super Loyal customer", 56, superAccount)

  println(superPersonWithISA.speak())

}
