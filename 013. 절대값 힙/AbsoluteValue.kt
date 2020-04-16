import kotlin.math.absoluteValue

//백준 절대값 힙
fun main(args: Array<String>) {
    val arr: MutableList<Int> = mutableListOf()
    val arr2: MutableList<Int> = mutableListOf()
    var count = readLine()!!.toInt()

    for (i in 0 until count) {

        var num = readLine()!!.toInt()

        when {
            num > 0 -> {
                arr.add(num)
            }
            num < 0 -> {
                arr2.add(num)
            }
            else -> {
                if (arr.size == 0 || arr2.size == 0) {
                    if (arr.size == 0) {
                        println(arr2.max())
                        arr2.removeAt(arr2.indexOf(arr2.max()))
                    } else if (arr2.size == 0) {
                        println(arr.min())
                        arr.removeAt(arr.indexOf(arr.min()))
                    } else
                        println(0)
                } else {
                    if (arr.min()!!.absoluteValue >= arr2.max()!!.absoluteValue) {
                        println(arr2.max()!!)
                        arr2.removeAt(arr2.indexOf(arr2.max()!!))
                    } else {
                        println(arr.min()!!)
                        arr.removeAt(arr.indexOf(arr.min()!!))
                    }
                }
            }
        }
    }
}
