/* - HackerRank New Year Chaos Code Challenge
solution ->
https://www.hackerrank.com/challenges/new-year-chaos/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

fun main() {
    minimumBribes2(arrayOf(1, 2, 3, 5, 4, 6, 7, 8)) // 1
    minimumBribes(arrayOf(4, 1, 2, 3)) // Too chaotic
    minimumBribes(arrayOf(2, 1, 5, 3, 4)) // 3
    minimumBribes(arrayOf(2, 5, 1, 3, 4)) // Too chaotic
    minimumBribes(arrayOf(5, 1, 2, 3, 7, 8, 6, 4)) // Too chaotic
    minimumBribes(arrayOf(1, 2, 5, 3, 7, 8, 6, 4)) // 7
}

fun minimumBribes2(q: Array<Int>): Unit {
    var bribe=0;var isChaotic=false
    for ((i, v) in q.iterator().withIndex()){val c=v-i-1;if(c>2){isChaotic=true;break}}
    if(isChaotic)println("Too chaotic")else{
        var r=0;var s=false
        while(!s&&r<q.size){s=true;for(i in 0..q.size-2-r){
            if(q[i]>q[i+1]){val aux=q[i];q[i]=q[i+1];q[i+1]=aux;bribe+=1;s=false}};r++
        };println(bribe)
    }
}

//complexity Big-O O(n^2),
fun minimumBribes(q: Array<Int>): Unit {
    printq(q)
    var bribe=0
    var isChaotic=false
    for ((index, value) in q.iterator().withIndex()){
        val calc=value-index-1 //determine if is too chaotic, if value is in 3 or more position in front of it, calculation = value - index > 2
        if(calc>2){ //
            isChaotic=true
            print("-->$index[$value] is ")
            break // If it found that one item is chaotic, so we not need continue the loop for
            // If the code stop here the complexity is Constant Omega (the best time)  Ω(1) or Linear Ω(n)
        }
    }
    if(isChaotic) println("Too chaotic") else {
        // if is no chaotic, so we continue with another operation, it was developed based on bubble sort algorithm, so it has O(n^2) complexity in the worst case
        var repeated=0 // used in inner loop to reduce one repetition after each complete external loop, because after loop the last element is ordered
        var isAlreadySorted=false //after the completion of an internal loop, if there was no change, the array is already sorted and we do not need to continue the algorithm, thus reducing its complexity time
        while(!isAlreadySorted && (repeated < q.size)){ //loop one
            isAlreadySorted=true //set is as true before start inner loop, so if
            for(i in 0..q.size-2-repeated){ // inner loop two
                if(q[i]>q[i+1]){ // if index left is more than index a right, do a swap
                    val aux=q[i]
                    q[i]=q[i+1]
                    q[i+1]=aux
                    bribe+=1 // save each swap, that represents each bribes
                    printq(q)
                    isAlreadySorted=false // if there is one swap, so the array was not sorted
                }
            }
            repeated++
        }
        println("bribes=$bribe")
    }
}

// Just print the array sequence to help understand the algorithm
fun printq(q: Array<Int>) {
    println()
    for(i in 0..q.size - 1){ print("$i[${q[i]}], ") }
}
