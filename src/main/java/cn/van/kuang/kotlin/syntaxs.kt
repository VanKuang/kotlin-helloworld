package cn.van.kuang.kotlin

import cn.van.kuang.kotlin.BingoNumber as bn

fun forLoop() {
    val list = listOf(1, 2, 3)
    for (ele in list) {
        println(ele)
    }

    for (index in list.indices) {
        println("item at $index is ${list[index]}")
    }

    val map = mapOf(1 to "1", 2 to "2")
    for ((k, v) in map) {
        println("key: $k, value: $v")
    }
}

fun type(obj: Any) {
    when (obj) {
        is Int -> println("Int")
        is Double -> println("Double")
        is Long -> println("Long")
        else -> println("UNKNOWN")
    }
}

fun main(args: Array<String>) {
    forLoop()

    type(1)
    type(1000_000)
    type(1.0)
    type(1L)

    println(1 in 1..10)

    for (x in 1..10 step 2) {
        println(x)
    }

    println(Player(1, "Kobe", "Lakers"))

    println(bn("test", 1))
}
