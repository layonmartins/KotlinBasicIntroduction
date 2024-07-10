package StringManipulation

fun main() {
    println("AAAA: ${alternatingCharacters("AAAA")}")
    println("BBBBB: ${alternatingCharacters("BBBBB")}")
    println("ABABABAB: ${alternatingCharacters("ABABABAB")}")
    println("BABABA: ${alternatingCharacters("BABABA")}")
    println("AAABBB: ${alternatingCharacters("AAABBB")}")
}

fun alternatingCharacters2(s: String): Int {
    var count = 0
    var a = 0
    var b = 1

    if(s.length == 1) {
        return 0
    } else {
        while (b < s.length) {
            if(s[a] == s[b]) {
                count++
                b++
            } else {
                a = b
                b++
            }
        }
    }

    return count
}

fun alternatingCharacters(s: String): Int {
    var count = 0; var a = 0; var b = 1
    if(s.length == 1) return 0
    while (b < s.length) { if(s[a] == s[b]) { count++; b++ } else { a = b; b++ } }
    return count
}