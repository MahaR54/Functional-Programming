
object task4 {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)

    // Use head to get the first element
    val firstElement = numbers.head
    println(s"First element: $firstElement")

    // Use tail to get the remaining elements
    val remainingElements = numbers.tail
    println(s"Remaining elements: $remainingElements")


    // Use map to double each number
    val doubledNumbers = numbers.map(x => x * 2)
    println(s"Doubled numbers: $doubledNumbers")

    // Use filter to get even numbers
    val evenNumbers = numbers.filter(x => x % 2 == 0)
    println(s"Even numbers: $evenNumbers")

  }
}
