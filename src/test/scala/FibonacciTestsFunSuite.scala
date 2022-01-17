package org.saylor.fibonacci

import org.scalatest.funsuite.AnyFunSuite

class FibonacciTestsFunSuite extends AnyFunSuite{

  val f: Fibonacci = new Fibonacci

  test("Fib(0) should return 0") {
    assert(f.fibonacci(0) == 0)
  }

  test("Fib(1) should return 1") {
    assert(f.fibonacci(1) == 1)
  }

  test("Fib(2) should return 1") {
    assert(f.fibonacci(2) == 1)
  }

  test("Fib(3) should return 2") {
    assert(f.fibonacci(3) == 2)
  }
  
  test("Fib(4) should return 3") {
    assert(f.fibonacci(4) == 3)
  }
  
  test("Fib(5) should return 5") {
    assert(f.fibonacci(5) == 5)
  }
}
