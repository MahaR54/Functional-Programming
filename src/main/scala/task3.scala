object task3 {
  def main(args: Array[String]): Unit = {
    def greetUser(name: Option[String]): String = name match {
      case Some(userName) => s"Hello, $userName!"
      case None => "Hello, Guest!"
    }

    val user1: Option[String] = Some("Maha")
    val user2: Option[String] = Some("Rehan")
    val user3: Option[String] = None

    println(greetUser(user1)) // Output: Hello, maha!
    println(greetUser(user2)) //output: hello, rehan
    println(greetUser(user3)) // Output: Hello, Guest!

  }
}
