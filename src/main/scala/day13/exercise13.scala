package day13
import scala.io.StdIn


abstract class Book( title: String, author: String) {
  def display(): Unit
}

class MyBook(title:String, author: String, price: Int)
  extends Book(title = title, author = author){
  def display(): Unit = {
     println(s"Title: $title")
     println(s"Author: $author")
     println(s"Price: $price")
  }

}


object exercise13 extends App {


  val scanner = scala.io.StdIn

  val title = scanner.readLine()
  val author = scanner.readLine()
  val price = scanner.readLine().trim.toInt


  val book = new MyBook(title, author, price)
  book.display()


}
