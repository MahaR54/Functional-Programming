object task9 {
  def maps[A, B](data: Seq[A], f:A=>B): Map[B,A] ={
    data.map(elem =>f(elem)->elem).toMap
  }

  def main(args: Array[String]): Unit = {
    val lst=Array(3,5,4,2,7,8,10)
    def fun(x: Int): Boolean={x % 2==0}
    val res: Map[Boolean, Int] = maps(lst, fun)
    println(res)
  }
}
