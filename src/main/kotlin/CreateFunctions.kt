/* - Create a function Unit and return String/Int */

// function without return type
fun fun1() : Unit {
    println("fun1")
}

fun fun2() : Int {
    return 0
}

fun double(x: Int) : Int {
    return x * x
}

fun fun4() = "fun4"

// fun with many arguments
fun fun5(
    x: Int,
    y: String,
    z: Boolean
) {
    //println("x = " + x + " y = " + y + " z = " + z) like java
    println("x = $x y = $y z = $z")
}

// named arguments
fun person(
    name: String,
    age: Int,
    isClient: Boolean
) : String {
    return "$name is $age year old and ${if(isClient) "is" else "is not"} our client"
}

// person fun simplified
fun person2(
    name: String,
    age: Int,
    isClient: Boolean
) = "$name is $age year old and ${if(isClient) "is" else "is NOT"} our client"


// person with default values
fun person3(
    name: String,
    age: Int? = null,
    isClient: Boolean = false
) = "$name ${if(age != null) "is $age year old and " else ""}${if(isClient) "is" else "is NOT"} our client"

fun main() {

    fun1()

    val n = fun2()
    println(n)

    println(double(2))

    println(fun4())

    fun5(2, "fun", true)

    println(person2(
        age = 31,
        isClient = true,
        name = "Tadao"
    ))

    println(person3(name = "João"))
    println(person3(name = "João", age = 28))
    println(person3(name = "João", isClient = true, age = 28))

}