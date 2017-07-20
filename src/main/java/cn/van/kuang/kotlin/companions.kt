package cn.van.kuang.kotlin

fun Int.Companion.random(): Int {
    val random = java.util.Random()
    return random.nextInt()
}