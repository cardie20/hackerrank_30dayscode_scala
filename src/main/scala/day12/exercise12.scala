package exercise12
import scala.io.StdIn._

class Person ( firstName: String, lastName: String, identification: Int){

  def printPerson(): Unit = {
    System.out.println("Name: " + lastName + ", " + firstName + 	"\nID: " + identification
    );
  }
}

class Student (firstName: String, lastName: String, id: Int , scores: List[Int]) extends Person (firstName, lastName , id ){
  def calculate(): Char = {
    val avg = scores.sum / scores.length
    avg match {
      case o  if  (avg >= 90 && avg <= 100)  => 'O'
      case e if (avg >= 80 &&  avg < 90 ) => 'E'
      case a if (avg >= 70 && avg < 80) => 'A'
      case p if (avg >=55 && avg < 70) =>'P'
      case d if (avg >= 40  && avg <55) => 'D'
      case t if (avg < 40) => 'T'

    }


  }
}
object exercise12  extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")

  val line =scala.io.StdIn.readLine().split(" ")

  val numElem= scala.io.StdIn.readLine().toInt

  val scores = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

  //val s = new Student(firstName= Heraldo, Memelli, 8135627, List(100,80))
  val s = new Student(firstName= line(0), line(1), line(2).toInt, scores)
  s.printPerson()
  System.out.println("Grade: "+ s.calculate())
}