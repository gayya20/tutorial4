object problem2 {
  def main(args:Array[String]):Unit={
    def even_odd(input:Int)= input match {
      case x if x==0 => 0
      case x if x%2==0 => "Even"
      case _ =>"odd"
    }
    println("enter the number")
    var num=scala.io.StdIn.readInt()
    println(even_odd(num))
  }

}
