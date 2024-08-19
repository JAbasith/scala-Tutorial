object InterestCal{

  def interest(deposit: Double): Unit={
    val interest = (deposit: Double) => deposit match {
      case d if (d <= 20000) => deposit * 0.02
      case d if (d <= 200000) => deposit * 0.04
      case d if (d <= 2000000) => deposit * 0.035
      case _ => deposit * 0.065
    }
    val x = interest(deposit)
    println("Interest amount is: " + x)
  }

  def main(args: Array[String]): Unit={
    interest(1000000)
    interest(1000)
    interest(10000)
    interest(2000000)
  }
}
