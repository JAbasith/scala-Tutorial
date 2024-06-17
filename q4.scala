object CostCalculate{
	def main(args: Array[String]): Unit={
		val coverPrice = 24.95
		val noOfCopies = 10
		val discount = 0.4
		val shippingCost = 3
		
		val totalCost = if(noOfCopies <= 50){
			noOfCopies * coverPrice * (1-discount) + shippingCost
		}
		else{
			50 * coverPrice * (1-discount) + shippingCost + (noOfCopies - 50) * coverPrice * (1-discount) + (noOfCopies - 50) * 0.75
		}
		println(s"Total wholesale cost is $totalCost")
	}
}
