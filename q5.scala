object TotalTime{
    def main(args: Array[String]):Unit ={
        val d1 = 2
        val d2 = 3
        val d3 = 2
        
        val easyPace = 8
        val tempoPace = 7

	val t1 = d1 * easyPace
	val t2 = d2 * tempoPace
	val t3 = d3 * easyPace
	
	val totalTime = t1 + t2 + t3
	
	println(s"Total running time is $totalTime minutes")
    }
}
