/* - Define Array and List
 */

fun main() {

    // Creates arrayOf Int
    /*val arrayOfInt = arrayOf<Int>(1,2,3,4,5)
    println(arrayOfInt.get(4))
    println(arrayOfInt[0])
    println(arrayOfInt.joinToString())*/

    // Creates arrayOf Strings
    /*var riversArray = arrayOf<String>("Rio Amazonas", "Rio São Francisco", "Rio Negro")
    println(riversArray.joinToString())
    if ("Rio Solimões" !in riversArray) riversArray+= "Rio Solimões"
    println(riversArray.joinToString())*/


    // Creates an array with values [null, null, null]
    /*val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())*/

    // Creates an emptyArray
    /*var exampleArray = emptyArray<String>()
    println(exampleArray.joinToString())*/

    // Array Constructor
    // Creates an Array<Int> that initializes with zeros [0, 0, 0]
 /*   val initArray = Array<Int>(3) { 0 }
    println(initArray.joinToString())*/

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    /*val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) }*/

    // Creates a two-dimensional array
    /*val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())*/

    // Creates a three-dimensional array
    /*val threeDArray = Array(2) { Array(2) { Array<Int>(2) { 0 } } }
    println(threeDArray.contentDeepToString())
    threeDArray[0][1][0] = 2
    println(threeDArray.contentDeepToString())*/

    // Compare Arrays
    /*val simpleArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)*/
    // Compares contents of arrays
    //println(simpleArray.contentEquals(anotherArray))
    // Using infix notation, compares contents of arrays after an element changed
    /*simpleArray[0] = 10
    println(simpleArray contentEquals anotherArray)*/

    // Create Lists

    /*val list = listOf('a', 'b', 'c')
    println(list.size) // 3
    println("list.contains('a') is ${list.contains('a')}") // true
    println(list.indexOf('b')) // 1
    println(list[2]) // c*/

    // See -> https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/

    //Filters list
    /*val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)*/

    //Filter array
    /*val array = arrayOf("one", "two", "three", "four")
    val arraylongerThan3 = array.filter { it.length > 3 }
    println(arraylongerThan3)*/

    //Filter Maps
    /*val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11,  "key21" to 21,  "key31" to 31)
    println(numbersMap)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)*/

}