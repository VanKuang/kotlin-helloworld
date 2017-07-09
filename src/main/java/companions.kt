import java.util.*

fun Int.Companion.random(): Int {
    val random = Random()
    return random.nextInt()
}