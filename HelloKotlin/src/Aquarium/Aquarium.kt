package Aquarium

open class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
  open val volume: Double
    get() = (width * height * length / 1000).toDouble()

  open val water: Double
    get() = volume * 0.9

  constructor(numberOfFish: Int): this() {
    val water = numberOfFish * 2000
    val tank = water + water * 0.1
    height = (tank / (length * width)).toInt()
  }
}