object ImplicitStringConversion {
  // Define a case class for implicit conversion to String
  case class StringConvertible(value: Any) {
    def asString: String = value.toString
  }

  // Implicit conversion method
  implicit def anyToStringConvertible(value: Any): StringConvertible = {
    StringConvertible(value)
  }

  // Function that takes two inputs, implicitly converts them to strings, adds them, and prints the result
  def printStringSum[A, B](input1: A, input2: B)(implicit conv1: A => StringConvertible, conv2: B => StringConvertible): Unit = {
    val str1 = conv1(input1).asString
    val str2 = conv2(input2).asString

    val result = str1 + str2
    println(s"The sum of converted strings: $result")
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    printStringSum(42, "Hello")
    printStringSum(3.14, List(1, 2, 3))
  }
}
