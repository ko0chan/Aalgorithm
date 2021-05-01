//https://programmers.co.kr/learn/courses/30/lessons/42862#
class WorkoutClothes {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        val array = IntArray(n) { 1 }

        for (it in lost) array[it - 1] -= 1
        for (it in reserve) array[it - 1] += 1
        for (it in 0 until n - 1) {
            if (array[it] + array[it + 1] == 2) {
                array[it] = 1
                array[it + 1] = 1
            }
        }
        for (it in array) {
            if (it > 0) answer++
        }
        return answer
    }
}

fun main() {
    val n = 5
    val lost: IntArray = intArrayOf(2, 4)
    val reserve: IntArray = intArrayOf(1, 3, 5)

    WorkoutClothes().solution(n, lost, reserve)

}