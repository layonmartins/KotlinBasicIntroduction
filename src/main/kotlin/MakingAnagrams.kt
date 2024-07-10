fun main() {
    println(makeAnagram2("cde", "abc")) //4
    println(makeAnagram2("showman", "woman")) // 2
    println(makeAnagram2("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")) // 30
}

fun makeAnagram(a: String, b: String): Int {
    var i = 0
    var a2 = StringBuilder(a.toCharArray().sorted().joinToString(""))
    var b2 = StringBuilder(b.toCharArray().sorted().joinToString(""))
    while(i < a2.length) { if(b2.contains(a2[i])){ b2.deleteAt(b2.indexOf(a2[i])); a2.deleteAt(i) } else { i++ } }
    return a2.length + b2.length
}
fun makeAnagram1(a: String, b: String): Int {
    var count = 0
    var a2 = a
    var b2 = b

    for (i in 0..a.length - 1) {
        if(!b2.contains(a[i])){
            a2 = a2.replace(a[i].toString(), "")
            count++
        } else {
            // tirar a[i] de dentro do b
            val index = b.indexOf(a[i])
            b2 = b2.replace(a[i].toString(), "")
        }
    }

    println("final a = $a")
    println("final a2 = $a2")

    for (i in 0..b.length - 1) {
        if(!a.contains(b[i])){
            b2 = b2.replace(b[i].toString(), "")
            count++
        }
    }

    println("final b = $b")
    println("final b2 = $b2")



    println(a2.toCharArray().sorted().joinToString(""))
    println(b2.toCharArray().sorted().joinToString(""))

    return count
}

fun makeAnagram2(a: String, b: String): Int {
        val ac = a.groupingBy { it }.eachCount()
        val bc = b.groupingBy { it }.eachCount()
        return ((ac - bc) + (bc - ac)).values.sum()
}