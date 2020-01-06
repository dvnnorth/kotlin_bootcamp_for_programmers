import java.util.Random

fun main(args: Array<String>) {
  for (i in 1..100) {
    feedTheFish()
  }
}

fun feedTheFish() {
  val day = randomDay()
  val food = fishFood(day)
  println("Today is $day and the fish ${if (food === "fasting") "are $food" else "eat $food"}")
  swim(speed = "fast")
  swim("slow")
  swim("at a medium pace")
  shouldChangeWater(day, 20, 50)
  shouldChangeWater(day)
  shouldChangeWater(day, dirty = 29)
}

fun randomDay(): String {
  val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
  return when (day) {
    "Sunday" -> "plankton"
    "Monday" -> "flakes"
    "Wednesday" -> "red worms"
    "Thursday" -> "granules"
    "Friday" -> "mosquitoes"
    else -> "fasting"
  }
}

fun swim(speed: String = "fast") {
  println("Swimming $speed")
}

// Best practise: parameters with no default values should be declared first. Otherwise, you would have to always
// specify the parameter by name when you call that function (you should default to passing arguments to parameters that
// have no default positionally)
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
  return true
}