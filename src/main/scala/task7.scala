object task7 {
  def main(args: Array[String]): Unit = {
    def sum(x:Array[Double],y:Array[Double]): Array[Double]={
      x.zip(y).map{case(a,b)=>a+b}
    }
    val a=Array[Double](1.2,2.2,3.2)
    val b=Array[Double](3.3,4.3,5.3)
    sum(a,b).foreach(println)
  }
}
