import scala.math.sqrt
object task3 {
  def euclidean(vector: List[Int]): Double={
    val squaredSum = vector.map(x=>x*x).sum
    sqrt(squaredSum)
  }

  def main(args: Array[String]): Unit = {
    val myVector = List(5, 7, 5)
    val norm=euclidean(myVector)
    println(s"$norm")
  }

}
