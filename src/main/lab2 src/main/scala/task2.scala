object task2 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7

    //defining range
    val xRange = Range(-3, 4)

    //functon that will cal
    def cal(x: Int): Int = (a * x * x) + (b * x) + c

    //map the element
    val mappedlist = xRange.map(cal)

    //print the mapped list
    print("mappedList" + mappedlist)

    //verify the result
    for (x <- xRange) {
      val expected = cal(x)
      val actual = mappedlist(x + 3)
      print(s"for x=$x, Expected: $expected, Actual: $actual")
    }
    //zip the xRange and mappedlist
    val zippedlist = xRange.zip(mappedlist)

    //zipping the list with the indexes
    val zippedwdindex = zippedlist.zipWithIndex

    //create a list with three element per pair
    val resultlist= zippedwdindex.map{
      case ((x,fx),index) => (x, fx, index)

    }
    // Calculate the mean value of f(x)
    val mean = resultlist.map { case (x, fx, _) => fx }.sum.toDouble / resultlist.length

    // Print the zipped list with indices
    println("Zipped List with Indices: " + resultlist)

    // Print the mean value of f(x)
    println("Mean value of f(x): " + mean)
  }
}
