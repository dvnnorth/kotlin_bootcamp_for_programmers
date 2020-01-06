fun main() {
  println(whatShouldIDoToday("happy"))
  println(whatShouldIDoToday("happy", weather = "rainy"))
  println(whatShouldIDoToday("sad", temperature = 39))
  println(whatShouldIDoToday("apathetic", "rainy", 30))
  println(whatShouldIDoToday("happy", "drizzly", 13))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
  return when {
    mood == "happy" && weather == "sunny" -> "go for a walk"
    else -> "Stay home and read."
  }
}