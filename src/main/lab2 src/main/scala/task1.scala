object task1 {
  def main(args: Array[String]): Unit = {
    val a= 3
    val b= 5
    val c= 7

    //defining range
    val xRange = Range(-3,4)

    //functon that will cal
    def cal(x: Int): Int=(a*x*x)+(b*x)+c

    //map the element
    val mappedlist = xRange.map(cal)

    //print the mapped list
    print ("mappedList"+ mappedlist)

    //verify the result
    for(x<-xRange){
      val expected= cal(x)
      val actual= mappedlist(x+3)
      print(s"for x=$x, Expected: $expected, Actual: $actual")
    }
  }

}
