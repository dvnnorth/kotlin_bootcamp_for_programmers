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