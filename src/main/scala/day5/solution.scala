import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Day5 {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt
    if ( n >= 2 && n <= 20) {
      for (i <- 1 to 10){
        //println(s"$nx$i=${n*i}")
        println(s"$n x $i = ${n*i}")

      }
    }
  }
}
