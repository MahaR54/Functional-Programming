object task1 {
  def main(args: Array[String]): Unit = {
    val array5 = new Array[Int](4)
    array5(0) = 10
    array5(1) = 20
    array5(2) = 30
    array5(3) = 40
    for (i <- array5) {
      println(i)
    }
    val arr1 = Array(1, 2, 3, 4, 5)
    for (i <- arr1) {
      println("array-1: " + i)
    }

    val size = 5
    val array2 = Array.ofDim[Int](size)
    for (i <- array2) {
      println("array-2: " + i)
    }

    val array4 = Array.fill(3)("Hello")
    for (i <- array4) {
      println("array-4: " + i)
    }
  }
}


