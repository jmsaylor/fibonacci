package org.saylor.fibonacci

object Fibonacci extends App {
  val f: Fibonacci = new Fibonacci
  println(f.fibonacci(5))
}

class Fibonacci {

  def fibonacci(x: Double): Double =
    if x == 0 then 0
    else if x <= 2 then 1
    else fibonacci(x - 1) + fibonacci(x - 2)

}
