package cn.van.kuang.kotlin

class BingoNumber(val name: String, val age: Int) {

    operator fun compareTo(other: cn.van.kuang.kotlin.BingoNumber): Int {
        return when {
            age < other.age -> -1
            age < other.age -> 1
            else -> 0
        }
    }

    override fun toString(): String {
        return "cn.van.kuang.kotlin.BingoNumber(name='$name', age=$age)"
    }


}

fun main(args: Array<String>) {
    val a = cn.van.kuang.kotlin.BingoNumber("Key to the door", 21)
    val b = cn.van.kuang.kotlin.BingoNumber("Jump and Jive", 35)

    println(a.toString())
    println(b.toString())

    println(a < b)
    println(a > b)
}