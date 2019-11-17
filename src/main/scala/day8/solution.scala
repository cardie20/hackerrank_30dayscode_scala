object Day8 {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

    val n = scala.io.StdIn.readLine.trim.toInt
    if (n >= 1  && n <=100000){
      var phoneBook= scala.collection.mutable.Map[String,String]()
      var line = Array[String]()
      for (i <- 1 to n){
        line=scala.io.StdIn.readLine.split(" ")
        phoneBook += line(0) -> line(1)
      }

      var value = ""


      val lines = Iterator.continually(scala.io.StdIn.readLine)
        .takeWhile(Option(_).fold(false)(_.nonEmpty))
        .toList


      // println("TOTAL " + lines.size)

      for ( value <- lines ) {

        if (phoneBook.contains(value)){
          //  println(phoneBook.getOrElse(value, "Not found"))
          println( value + "=" + phoneBook.get(value).get)
        }else{
          println("Not found")
        }
      }

      /*for (i <- 1 to n){
          value=scala.io.StdIn.readLine
          if (phoneBook.contains(value)){
          //  println(phoneBook.getOrElse(value, "Not found"))
              println( value + "=" + phoneBook.get(value).get)
          }else{
              println("Not found")
          }
      }*/
    }
  }
}

