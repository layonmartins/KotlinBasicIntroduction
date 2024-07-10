fun main() {
    val array = arrayOf(1,2,3, true, 'o')
    array[1]
    println(array.joinToString())

    val list = listOf(1,2,3, true, "list")
    list[0]
    println(list.joinToString())


    val arrayList = arrayListOf(1,2,3, true, "arrayList")
    arrayList[0]
    println(arrayList.joinToString())


    val mutableList = mutableListOf(1,2,3, "oi")
    mutableList[0]
    mutableList.add("oi")
    println(mutableList.joinToString())

}