import scala.collection.mutable.Set
import scala.collection.mutable.Map
object task2 {
  def main(args: Array[String]): Unit = {

    val mutableSet = Set(1, 2, 3)
    mutableSet += 4 // Add an element to the mutable set
    mutableSet -= 2 // Remove an element from the mutable set
    print("Mutable set: ")
    mutableSet.foreach(println)

    val mutableMap = Map("a" -> 1, "b" -> 2)
    mutableMap("c") = 3 // Add a key-value pair to the mutable map
    mutableMap.remove("b") // Remove a key from the mutable map
    print("Mutable map: ")
    mutableSet.foreach(println)

  }
}
