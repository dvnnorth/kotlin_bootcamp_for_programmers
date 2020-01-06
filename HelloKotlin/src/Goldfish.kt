import java.util.Random

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = "Pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}