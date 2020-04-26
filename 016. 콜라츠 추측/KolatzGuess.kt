class Solution {
    fun solution(num: Int): Int {
        var count = 0
        var number: Long = num.toLong()

        while (number != 1L) {
            if (count == 500) {
                return -1
            }
            if (number % 2 == 0L) {
                number /= 2
            } else {
                number = (number * 3) + 1
            }
            count++
        }
        return count
    }
}

fun main(args: Array<String>) {
    var num: Int = 626331
    print(Solution().solution(num))
}