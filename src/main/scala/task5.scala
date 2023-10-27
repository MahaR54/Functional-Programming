import scala.util.Random
import scala.collection.mutable.Map
object task5 {
  def main(args:Array[String]): Unit={
    def isPrime(n: Int): Boolean= {
      var a = 2; var res = true
      while (a < n) {
        if (n % a == 0) {
          res = false; return res
        }
        a = a + 1
      }
      res
    }
      val random = new Random()
      val lst = List.fill(15)(random.nextInt(451) + 50)
      val prime = lst.filter(isPrime(_))
      val sort = prime.sorted
      var x = 0
      val maps: Map[Int, Int] = scala.collection.mutable.Map()
      while (x < sort.size) {
        maps += x -> sort(x);
        x += 1
      }
      print(maps)
  }
}
