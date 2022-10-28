fun main() {
    // put your code here

    val items = arrayOf(Int.SIZE_BITS, Int.MIN_VALUE, Int.MAX_VALUE)
    for (item in items){
        println(item)
    }


    val items1 = arrayOf(
        Byte.SIZE_BITS,
        Short.SIZE_BITS,
        Char.SIZE_BITS,
        Int.SIZE_BITS,
        Long.SIZE_BITS
    )
    for (item in items1){
        println(item)
    }
}

