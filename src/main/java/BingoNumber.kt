class BingoNumber(val name: String, val age: Int) {

    operator fun compareTo(other: BingoNumber): Int {
        return when {
            age < other.age -> -1
            age < other.age -> 1
            else -> 0
        }
    }

    override fun toString(): String {
        return "BingoNumber(name='$name', age=$age)"
    }


}

fun main(args: Array<String>) {
    val a = BingoNumber("Key to the door", 21)
    val b = BingoNumber("Jump and Jive", 35)

    println(a.toString())
    println(b.toString())

    println(a < b)
    println(a > b)
}