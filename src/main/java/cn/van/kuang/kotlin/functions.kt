package cn.van.kuang.kotlin

fun printWith(str: String, fn: (String) -> String): Unit {
    println(fn(str))
}

fun reverse(): (String) -> String = { str -> str.reversed() }

fun modulo(k: Int): (Int) -> Boolean = { it % 2 == k }

fun main(args: Array<String>) {
    printWith("hello", { it.reversed() })

    val reverse = reverse()
    println(reverse("hello"))

    val ints = listOf(1, 2, 3, 4, 5)
    val odds = ints.filter(modulo(1))
    val evens = ints.filter(modulo(0))

    println(odds)
    println(evens)

    val isEven = { k: Int -> k % 2 == 0 }
    ints.filter(isEven)

    fun isEven(k: Int): Boolean = k % 2 == 0
    ints.filter(::isEven)

    ints.filter(fun(k) = k % 2 == 0)

    fun Int.isOdd(): Boolean = this % 2 == 1
    ints.filter(Int::isOdd)
}