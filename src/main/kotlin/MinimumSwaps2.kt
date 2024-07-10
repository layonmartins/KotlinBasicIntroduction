

fun main() {
    println(minimumSwaps(arrayOf(7, 1, 3, 2, 4, 5, 6))) //5
    println(minimumSwaps(arrayOf(4,3,1,2))) //3
    println(minimumSwaps(arrayOf(2,3,4,1,5))) //3
    println(minimumSwaps(arrayOf(1,3,5,2,4,6,7))) //3
}

fun minimumSwaps(arr: Array<Int>): Int {
    var m=0;var i=0
    while (i<arr.size){if(arr[i] != i + 1) { val aux = arr[i]; arr[i] = arr[arr[i] - 1]; arr[aux - 1] = aux; m++} else i++}
    return m
}

fun minimumSwaps2(arr: Array<Int>): Int {
    var minimumSwaps = 0
    var i = 0
    while (i < arr.size) {
        if(arr[i] != i + 1) { // swap
            val aux = arr[i]
            arr[i] = arr[arr[i] - 1]
            arr[aux - 1] = aux
            minimumSwaps++
        } else {
            i++
        }
    }
    return minimumSwaps
}

/**---- / / -----

Example
7 [7,1,3,2,4,5,6]
0,6 [6,1,3,2,4,5,7]
0,5 [5,1,3,2,4,6,7]
0,4 [4,1,3,2,5,6,7]
0,3 [2,1,3,4,5,6,7]
0,1 [1,2,3,4,5,6,7]

Input 0
4 [4,3,1,2]
[4,3,1,2] 0,3
[2,3,1,4] 0,1
[3,2,1,4] 0,2
[1,2,3,4]

Input 1
5 [2,3,4,1,5]
0,1 [3,2,4,1,5]
0,2 [4,2,3,1,5]
0,3 [1,2,3,4,5]

Input 2
7 [1,3,5,2,4,6,7]
1,2 [1,5,3,2,4,6,7]
1,4 [1,4,3,2,5,6,7]
1,3 [1,2,3,4,5,6,7]


*/

