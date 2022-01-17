package org.saylor.fibonacci

import org.scalatest.*
import flatspec.*
import matchers.*

import scala.language.postfixOps

class FibonacciTestsFlatSpec extends AnyFlatSpec {

    val f: Fibonacci = new Fibonacci

    "Fib(0)" should "return 0" in {
      assert(f.fibonacci(0) == 0)
    }
}
