import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Day3 {



  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val N = stdin.readLine.trim.toInt
    if (N >= 1 && N <= 100){
      if ( (N % 2 != 0) || (N>=6 && N <= 20)){
        println("Weird")
      }else if (( N >= 2 && N <=5 ) ||( N >= 20)){
        println("Not Weird")

      }
    }
  }
}
