import java.util.Calendar

fun dayOfWeek() {
    val dayOfWeek = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "ERROR"
    }

    println("What day is it today?")
    println("It is $dayOfWeek my dudes")
}

fun main(args: Array<String>) {
    dayOfWeek()
}