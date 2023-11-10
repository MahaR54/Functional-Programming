object ListAdder {
  def apply(list: List[Int]): Unit = {
    val sum = list.sum
    println(s"The sum of the list elements is: $sum")
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    ListAdder(List(1, 2, 3, 4, 5))
    ListAdder(List(10, 20, 30, 40, 50))
  }
}
