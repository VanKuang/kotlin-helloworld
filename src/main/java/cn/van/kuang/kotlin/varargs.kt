package cn.van.kuang.kotlin

fun print(vararg args: String): Unit {
    for (arg in args) {
        println(arg)
    }
}

fun print(prefix: String, vararg args: String, suffix: String): Unit {
    println(prefix)

    for (arg in args) {
        println(arg)
    }

    println(suffix)
}

fun main(args: Array<String>) {
    print("a", "b", "c", "d")

    print("a", "b", suffix = "c")

    val strings = arrayOf("a", "b", "c")

    print("Start", *strings, suffix = "end")

    val str: String? = null

    println(str)
}
