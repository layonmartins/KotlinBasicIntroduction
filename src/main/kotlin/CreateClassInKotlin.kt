/* - Create Classes in Kotlin

 */

/*class Car {
    var brand = ""
    var model = ""
    var year = 0
}*/

// Create class car with constructor
//class Car(var brand: String, var model: String, var year: Int)

// Override function
/*class Car(var brand: String, var model: String, var year: Int) {
    override fun toString(): String {
        return "$brand, $model, $year"
    }
}*/

// Init block
/*class Car(var brand: String, var model: String, var year: Int) {
    init {
        println(this.toString())
    }
    override fun toString(): String {
        return "$brand, $model, $year"
    }
}*/

//inherance
/*
open class Car(var brand: String, var model: String, var year: Int) {

    init {
        println(this.toString())
    }

    protected fun open(){ //private, public, protected
        println("car opened")
    }

    // put without open
    open fun drive() {
        println("roommm!!!")
    }

    override fun toString(): String {
        return "$brand, $model, $year"
    }

}

class Ferrari(brand: String = "Ferrari", model: String = "F50", year: Int = 1950): Car(brand, model, year) {

    init {
        open()
    }

    override fun drive() {
        println("$model -> Rruuaaannnnnnnnnnnnnnnnn...........")
    }

}

class Mustang: Car("Ford", "Mustang GT", 1969) {

    override fun drive() {
        println("$model -> RrroommmmmASDFAUASDFWHATAFO@#>>>>PPPTTTTTrrrrrmmmmmm!!!!!!!!!!")
    }
}
*/

/*//Companion object
class Dog(breed: String, name: String) {
    init {
        println("      _=,_         \n" +
                "    o_/6 /#\\        \n" +
                "    \\__ |##/        \n" +
                "     ='|--\\         \n" +
                "       /   #'-.     \n" +
                "       \\#|_   _'-. /\n" +
                "        |/ \\_( # |\" \n" +
                "       C/ ,--___/   ")
    }
    companion object{
        val descendant = "Canine"
        fun song() = "Rauf, Rauf, Rauf!!!"
    }
}*/

fun main() {

    /*val c1 = Car() // obs: there is no "new" keyword
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969
    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)

    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999
    println(c2.brand)   // Outputs Ford
    println(c2.model)   // Outputs Mustang
    println(c2.year)*/

    /*val c1 = Car("Ford", "Mustang", 1969)
    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)*/

    /*println(Car("Ford", "Mustang", 1969))
    println(Car("BMW", "X5", 1999))
    println(Car("Tesla", "Model S", 2020))
     */

    /*Car("Ford", "Mustang", 1969)
    Car("BMW", "X5", 1999)
    Car("Tesla", "Model S", 2020)*/

    /*val f50 = Ferrari()
    val mustang = Mustang()
    f50.drive()
    mustang.drive()
    //f50.open() // public, private, protected*/

    //Data Class
    // not need getters and setters
    /*data class User(val name: String, var age: Int)

    val ji = User(name="Jiselli", age = 15)
    println(ji)
    val ji2 = ji.copy()
    println(ji2)
    ji2.age = 20
    println(ji2)*/

    // To use companion object not need to instantiate the class
    /*println("${Dog.descendant}: ${Dog.song()}")
    // Instantiate
    Dog("Fox Paulistinha", "Lisa")*/

}
