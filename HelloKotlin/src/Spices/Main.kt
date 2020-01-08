package Spices

fun main(args: Array<String>) {
  val cumin = SimpleSpice("cumin")
  println("My spice name is ${cumin.name} and its heat level is ${cumin.heat}")

  val spices = listOf<Spice>(
      Spice(name = "Cumin", spiciness = "mild"),
      Spice(name = "Cayenne", spiciness = "spicy"),
      Spice(name = "Ghost Pepper Flakes", spiciness = "extra spicy"),
      Spice(name = "Pure Capsaicin", spiciness = "napalm")
  )

  val salt = makeSalt()
}

fun makeSalt(): Spice = Spice(name = "Salt", spiciness = "mild")