/* - Kotlin ScopeFunctions

 The Kotlin standard library contains several functions whose sole purpose is to execute a block of code within the context of an object.
 There are five of them: let, run, with, apply, and also.
 See -> https://kotlinlang.org/docs/scope-functions.html

 */

/*
data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}
*/

data class Person(var name: String, var age: Int = 0, var occupation: String = "", var seniority: String = "", var city: City)
data class City(var name: String, var UF: String, var country: String)

fun main() {

    /*val alice = Person("Alice", 20, "Amsterdam")
    println(alice)
    alice.moveTo("London")
    alice.incrementAge()
    println(alice)*/


    /*// LET scope function
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }*/

    // without let
    /*val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)*/

    //with let
  /*  val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }*/

    // let with null
    /*val numbers = mutableListOf(null, null, null, "Hello not null let")
    numbers.forEach { item ->
        item?.let {
            println(it)
        }
    }*/


    // -- APPLY  scope function

   /* val adam = Person(name = "Adam", city = City("Campinas", "SP", "Brasil"))
    adam.apply {
        age = 32
        occupation = "Software Developer"
        seniority = "Senior"
        city.apply {
            name = "Chicago"
            UF = "Illinois"
            country = "EUA"
        }
    }
    println(adam)*/

   /* // ALSO Scope function
    mutableListOf(1,2,3,4).also {
        println("After create the list also print it $it")
        it.add(5)
        it.removeAt(0)
    }.also {
        //also again
        println(it)
    }*/

}