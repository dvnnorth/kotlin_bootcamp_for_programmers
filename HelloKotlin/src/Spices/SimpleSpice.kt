package Spices

class SimpleSpice(var name: String = "curry", private var spiceLevel: String = "mild") {
  val heat: Int
    get() = when (spiceLevel) {
      "mild" -> 5
      "spicy" -> 10
      "extra spicy" -> 15
      "napalm" -> 20
      else -> 0
    }
}