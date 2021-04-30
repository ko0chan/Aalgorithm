class HashadNumber {
    fun solution(x: Int): Boolean {
        var stringInt = x.toString()
        var sum: Int = 0
        for (i in stringInt) {
            sum += i.toInt()-48
        }
        
        return x % sum == 0
    }
}

fun main(args: Array<String>) {
    var x = 10
    HashadNumber().solution(x)
}