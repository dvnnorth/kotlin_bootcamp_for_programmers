// fun main() {
//   println(whatShouldIDoToday("happy"))
//   println(whatShouldIDoToday("happy", weather = "rainy"))
//   println(whatShouldIDoToday("sad", temperature = 39))
//   println(whatShouldIDoToday("apathetic", "rainy", 30))
//   println(whatShouldIDoToday("happy", "drizzly", 13))
// }
//
// fun whatShouldIDoToday(
//     mood: String,
//     weather: String = "sunny",
//     temperature: Int = 24
// ): String {
//   return when {
//     mood == "happy" && weather == "sunny" -> "go for a walk"
//     else -> "Stay home and read."
//   }
// }

fun main() {
  println(whatShouldIDoToday())
  println(whatShouldIDoToday(weather = "rainy"))
  println(whatShouldIDoToday(weather = "rainy", temperature = 0))
  println(whatShouldIDoToday("rainy", 30))
  println(whatShouldIDoToday("drizzly", 13))
}

fun whatShouldIDoToday(
    weather: String = "sunny",
    temperature: Int = 24
): String {
  println("Weather: $weather, Temperature: $temperature")
  print("Yo, what's your mood dawg? ")
  var mood = readLine() ?: "neutral"
  if (mood == "") mood = "neutral"
  println("Mood: $mood")
  return when {
    amInWalkingMood(mood, weather) -> "go for a walk"
    amInStayInBedMood(mood, weather, temperature) -> "stay in bed"
    amInIndieMood(mood, weather) -> "listen to Death Cab for Cutie"
    amInSwimmingMood(temperature)-> "go swimming"
    amMelting(temperature) -> "melt"
    else -> "Stay home and read."

  }
}

fun amInWalkingMood(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun amInStayInBedMood(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun amInIndieMood(mood: String, weather: String) = mood == "pensive" && weather == "foggy"
fun amInSwimmingMood(temperature: Int) = temperature > 35
fun amMelting(temperature: Int) = temperature > 100