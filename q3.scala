object SphereVolume{
	def main(args: Array[String]): Unit = {
	val radius = 5
	val volume = 4/3* math.Pi * radius * radius * radius
	println(s"Volume of the sphere with radius $radius is $volume.")
	}
}
