package com.learning

object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Complex(1.2, 3.4)
    println("complex number is: " + c)
    println("imaginary part: " + c.im)
  }
}
