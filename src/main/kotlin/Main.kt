import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    print("Enter The Start Year: ")
    val startYear = scanner.nextInt()

    print("Enter The End Year: ")
    val endYear = scanner.nextInt()

    if (endYear > startYear) {
        println("\nYear & Number of Days ")
        var totalDays = 0

        for (year in startYear..endYear) {
            val daysInYear = numOfDays(year)
            println("$year = $daysInYear days")
            totalDays += daysInYear
        }

        println("\nTotal days between $startYear and $endYear: $totalDays days")
    } else {
        println("End Year must be Greater than Start Year.")
    }
}
fun numOfDays(year: Int): Int {
    return if (leapYear(year)) 366 else 365
}

fun leapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
}