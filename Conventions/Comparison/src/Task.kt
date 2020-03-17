data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    // override fun compareTo(other: MyDate): Int {
    //     if (year < other.year) return -1
    //     if (year == other.year) {
    //         if (month < other.month) return -1
    //         if (month == other.month) {
    //             if (dayOfMonth < other.dayOfMonth) return -1
    //             if (dayOfMonth == other.dayOfMonth) return 0
    //         }
    //     }
    //     return 1
    // }
    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
