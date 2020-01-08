package Spices

class Spice(var name: String, private val spiciness: String = "mild") {
  val heat: Int
    get() = when (spiciness) {
      "mild" -> 5
      "spicy" -> 10
      "extra spicy" -> 15
      "napalm" -> 20
      else -> 0
    }
  init {
    println("Spice $name created")
    println("  Spiciness: $spiciness")
    println("  Heat level: $heat")
  }
}