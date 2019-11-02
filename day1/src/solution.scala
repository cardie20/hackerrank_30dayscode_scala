object Solution {
  def main(args: Array[String]) {
    val i = 4
    val d = 4.0
    val s = "HackerRank "
    import scala.io.StdIn._
    // Read values of another integer, double, and string variables
    // Note use scala.io.StdIn to read from stdin
    val ri = readInt()
    val rd = readDouble()
    val rs = readLine()
    // Print the sum of both the integer variables
    println(i+ri)
    // Print the sum of both the double variables
    println(d+rd)
    // Concatenate and print the string variables
    // The 's' variable above should be printed first.
    println(s+rs)
  }
}
