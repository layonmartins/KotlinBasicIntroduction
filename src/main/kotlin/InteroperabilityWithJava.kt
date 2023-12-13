/* - Interoperability with Java and Kotlin
 we can work with kotlin and use codes/lib in Java
 */

import java.util.*

fun demo(source: List<Int>) {

    println("Code inside Kotlin class")
    val list = ArrayList<Int>()
    // 'for'-loops work for Java collections:
    for (item in source) {
        list.add(item)
    }
    println(list)

    // Operator conventions work as well:
    for (i in 0..source.size - 1) {
        list[i] = source[i] // get and set are called
    }
    println(list)
}

fun main() {
    demo(listOf(1,2,3))
}