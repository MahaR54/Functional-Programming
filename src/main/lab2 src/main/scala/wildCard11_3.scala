object wildCard11_3 {
  def main(args: Array[String]): Unit = {
    val list1=List.range(1,6)
    def g(v:Int)=List(v-1,v,v+1)
    val list_ext=list1.map(g(_))
    val list_map=list1.flatMap(g(_))
    println(s"$list_map")
    println(s"$list_map")
  }
}
