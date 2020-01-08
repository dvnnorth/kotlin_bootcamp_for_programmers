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
  println(shouldChangeWater(day, 20, 50))
  println(shouldChangeWater(day))
  println(shouldChangeWater(day, dirty = 29))
  dirtyProcessor()
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
    // CUIDADO
    // This is a really cool feature of Kotlin, but be careful not to use expensive functions to initialize
    // default parameters! No file i/o, no memory heavy stuff
    dirty: Int = getDirtySensorReading()
): Boolean {
//  val isTooHot = temperature > 30
//  val isDirty = dirty > 30
//  val isSunday = day == "Sunday"
  return when {
    isTooHot(temperature) -> true
    isDirty(dirty) -> true
    isSunday(day) -> true
    else -> false
  }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun getDirtySensorReading() = 20

var dirty = 20

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
  return operation(dirty)
}

fun dirtyProcessor() {
  dirty = updateDirty(dirty, waterFilter)
  println("dirty: $dirty")
  dirty = updateDirty(dirty, ::feedFish)
  println("dirty: $dirty")
  dirty = updateDirty(dirty) { dirty ->
    dirty + 50
  }
  println("dirty: $dirty")
}