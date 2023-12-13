/* Define val and var - Null safety
 - val and var
 - https://kotlinlang.org/docs/keyword-reference.html
 */
fun main() {

    val a : Int = 0
    println(a)

    val b = 1
    println(b)

    var c = "kotlin"
    println(c)

    //lateinit
    lateinit var name: String
    //println(name) //error lateinit property name has not been initialized
    name = "layon"
    println(name)

    c = "JetBrains"
    println(c)

    c = a.toString()
    println(c)

    //var d : Int = "java".toInt() //Exception in thread "main" java.lang.NumberFormatException
    val d : Int = try { "java".toInt() } catch(e: Exception) { 0 }
    println(d)

    val e : Int = "01".toInt()
    println(e)

    //val number = 100 // int
    //val number = 10000000000 // long
    //val number = 10L // force to be long
    //val number = 1.1 // double
    //val number = 1.100000000000000000000000000000000 // double
    //val number = 1.1f
    //val number = BigDecimal(100000000)
    //val number = true
    //val number = 'a'
    //val number = "a"
    //println(number::class.java.typeName)

    // Null Safety
    //val number = null
    //println(number::class.java.typeName) //compile error
    //println(number!!::class.java.typeName) // Use !! asserts that an expression is non-nullable / will launch a NullPointerException

    //var nullSafe : Int? = 2
    //println(nullSafe?.javaClass)

    var nullSafe : Int? = null
    println(nullSafe?.javaClass)

    var notNullSafe : Int = 2
    //notNullSafe = null // Error Null can not be a value of a non-null type Int

}