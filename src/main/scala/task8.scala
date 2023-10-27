object task8 {
  def main(args: Array[String]): Unit = {
    def even1(n:Array[Int]):Int={
      var i=0
      var count=0
      while(i<n.size){
        if(n(i)%2==0){count=count+1}
        i+=1
      }
      count
    }
    def even(n:Array[Int]):Int={n.filter(_%2 ==0).size}
    val ary:Array[Int]=Array.fill(100)(util.Random.nextInt(100))
    println(even1(ary))
    println(even(ary))
  }
}
