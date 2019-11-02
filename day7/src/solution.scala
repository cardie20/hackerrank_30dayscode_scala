object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val t =  scala.io.StdIn.readLine.trim.toInt
    if ( t >=1 && t <=10) {
      for (i <- 1 to t){
        var s = scala.io.StdIn.readLine().trim
        var even:String = ""
        var odd:String = ""
        for (j <- 0 to s.length()-1){

          if (j % 2 == 0){
            even = even + s.charAt(j)
          }else{
            odd = odd + (s.charAt(j))
          }

        }
        println(s"$even $odd")
      }
    }
  }
}