object task6 {
  def main(args: Array[String]): Unit = {
    def alphabets(n: Int):List[Char]={
      var lst=List[Char]();
      for(i<-0 .to(25)){
        lst=lst:+(n+i).toChar;}
      lst}
    print(alphabets(97))
    }

}
