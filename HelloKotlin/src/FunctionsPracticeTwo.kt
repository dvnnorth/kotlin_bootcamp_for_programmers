import java.util.*

fun main(args: Array<String>) {
  var fortune: String
  do {
    fortune = getFortune(getBirthday())
    println("\nYour fortune is: $fortune")
  } while (!fortune.contains("Take it easy"))
}

fun getFortune(birthday: Int): String {
  val fortunes = listOf(
      "You will have a great day!",
      "Things will go well for you today.",
      "Enjoy a wonderful day of success.",
      "Be humble and all will turn out well.",
      "Today is a good day for exercising restraint.",
      "Take it easy and enjoy life!",
      "Treasure your friends because they are your greatest fortune."
  )
  return when {
    birthday in 1..7 ->
      "Your birthday is in the first week... you are MEGA DOOMED. Man, sucks to be you."
    birthday == 28 || birthday == 31 ->
      "Your birthday is on the 28th or 31st... you are DOOMED. Sorry, them's the breaks kiddo."
    birthday <= 0 || birthday >= 32 ->
      "ERROR: NON-EXISTENT BIRTH DATE, ANOMALIES WILL BE TERMINATED"
    else -> fortunes[birthday % fortunes.size]
  }
}

fun getBirthday(): Int {
  println("Enter the numerical date of your birth (just day portion, i.e. 8/9/1997, enter 8):")
  return readLine()?.toIntOrNull() ?: Random().nextInt(32)
}