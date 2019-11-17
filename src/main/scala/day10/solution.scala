import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Day10 {

  def binary_value( n: Int, binary_number: String): String = {
    n match {
      case 1 => ( "1" + binary_number)
      case _ => binary_value(n/2 , (n%2).toString+ binary_number)
    }
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val binary = binary_value(n, "")

    var reset = false
    var count = 0
    var max=0

    for ( i<-0 to binary.length()-1){
      if (i == 0 ) {
        count = 1;
        max=1
      } else {

        if (binary.charAt(i).asDigit == 1){
          count = count + 1
          reset = false
        }else{
          max = Math.max(max, count)
          count=0
          reset = true
        }
      }

    }
    println(Math.max(max, count))
  }
}
