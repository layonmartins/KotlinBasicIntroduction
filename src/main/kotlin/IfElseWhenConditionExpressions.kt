/* - If Else and When expression
 https://kotlinlang.org/docs/control-flow.html
 */

fun main() {

   /* // if

    val a = 2
    val b = 3

    var max = a
    if (a < b) max = b
    println()

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression
    max = if (a > b) a else b

    // You can also use `else if` in expressions:
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b


    println("max is $max")
    println("maxOrLimit is $maxOrLimit")

    val max2 = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

    println("max2 is $max2")*/


   /* // when
    val x = 3
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }*/

    /*// when
    val x = 0
    when (x) {
        in 0..10 -> print("x is between 1 in 10")
        else -> {
            print("x is more then 10")
        }
    }*/


    // when can return
    /*val x = 2
    val square = when (x) {
        1 -> 1
        2 -> 4
        3 -> 9
        else -> x
    }
    println("square of $x is $square")*/

    // when
    /*val x = 0
    when (x) {
        in 0..10 -> print("x is between 1 in 10")
        else -> {
            print("x is more then 10")
        }
    }*/

   /* // when can be use as no argumnts
    val isClient = false
    val isGoldClient = false
    val isVipClient = false
    val isMasterClient = false
    when {
        isClient -> print("isClient")
        isGoldClient -> print("isGoldClient")
        isVipClient -> print("isVipClient")
        isMasterClient -> print("isMasterClient")
        2 > 1 -> println("2 > 1")
        else -> print("else switch")
    }*/


    /*fun requestApi() : String {
        val x = (0..2).random()
        return if(x == 0) "Success" else if(x == 2) "Error" else "Bad Request"
    }

    fun requestDetail() = "Success - Details of request..."

    fun getStatusApi() =
        when (requestApi()) {
            "Success" -> requestDetail()
            "Error" -> "Error 404 User not found"
            else -> "Time out"
        }

    println(getStatusApi())*/

}