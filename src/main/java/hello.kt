fun fizzFuzz(start: Int, end: Int) {
    for (index in start..end) {
        fun isFizz() = index % 3 == 0
        fun isBuzz() = index % 5 == 0

        when {
            isFizz() && isBuzz() -> println("Fizz Buzz")
            isFizz() -> println("Fizz")
            isBuzz() -> println("Buzz")
            else -> println(index)
        }
    }
}

fun main(args: Array<String>) {
    fizzFuzz(1, 10)
}