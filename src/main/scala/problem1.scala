object problem1 {

  def main(args:Array[String]):Unit={

  }
  def actual_amount(money:Int):Double= money match {
    case x if x<0 => 0
    case x if x<20000 => x*.02
    case x if x<200000 =>x*.04
    case x if x<2000000 => x*0.035
    case x if x>=2000000 => x*.065
  }
  println(actual_amount(2000000))

}

