/* - Extension Functions */

import java.util.ArrayList

// Extension function based in ceaser cipher
fun String.cipher() : String {
    var newString = ""
    this.forEach { newString += it.inc() }
    return newString
}

// Extension function based in ceaser cipher
fun String.decipher() : String {
    var newString = ""
    this.forEach { newString += it.dec() }
    return newString
}


// Extension function of Java ArrayList class:
private fun <E> ArrayList<E>.swape(x: Int, y: Int): String {
    val aux = this[x]
    this[x] = this[y]
    this[y] = aux
    return this.joinToString()
}

fun main() {

    // Kotlin _Strings.kt extension funciont
    var name: String = "layon"
    //println(name.reversed()) // reserved() already is a extension function of kotlin
    println(name.cipher())
    println(name.cipher().decipher())


    // Create a Java Code extension function without inherit the java ArrayList class
    val arrayJava: ArrayList<Int> =  arrayListOf(1,2,3,4,5)
    println(arrayJava.swape(0,4))

}
