object PatternMatch{

	def pattern(input : Int): Unit={
		val y = (input: Int) => input match {
			case i  if i <= 0 => println("Input is Negetive/zero")
			case i  if i % 2 == 0 => println("Input is Even")
			case _ => println("Input is Odd")
		}
		y(input)
	}

	def main(args: Array[String]): Unit={
		println("Enter number: ")
		val userInput: Int = scala.io.StdIn.readInt()
		pattern(userInput)
	}
}
