data class Car(
    val manufacturer: String,
    val name: String,
    val engine: Float)

fun main() {

    val cars = listOf(
        Car("Hyundai", "Hb20", 1.0F),
        Car("Hyundai", "Creta", 2.0F),
        Car("Hyundai", "Tucson", 1.6F),
        Car("Hyundai", "Azera", 3.0F)
    )

    println(cars)

    val mapped = cars.filter {
        it.engine > 1.0F
    }.map {
        it.engine
    }

    println(mapped)


}