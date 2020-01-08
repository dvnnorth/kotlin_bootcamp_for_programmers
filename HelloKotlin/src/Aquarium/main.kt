package Aquarium

fun main (args: Array<String>) {
  buildAquarium()
}

internal fun buildAquarium() {
  val myAquarium = Aquarium()
  println("Length: ${myAquarium.length} cm\n" +
          "Width: ${myAquarium.width} cm\n"+
          "Height: ${myAquarium.height} cm")

  myAquarium.height = 80

  println("New Height: ${myAquarium.height} cm")
  println("Area: ${myAquarium.volume} liters")

  val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
  println("Volume for smallAquarium is ${smallAquarium.volume} liters")

  val smallAquarium2 = Aquarium(numberOfFish = 9)
  println("Small Aquarium 2 is ${smallAquarium2.volume} liters with" +
          "length ${smallAquarium2.length}" +
          "width ${smallAquarium2.width} " +
          "height ${smallAquarium2.height} ")
}