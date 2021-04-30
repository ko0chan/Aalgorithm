class WorkoutClothes {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var array: IntArray = IntArray(5) {
            it
        }

        reserve.forEach {
            array[it]--
        }
        print(array)

        return answer
    }
}

fun main() {
    val n = 5
    val lost: IntArray = intArrayOf(2, 4)
    val reserve: IntArray = intArrayOf(1, 3, 5)

    WorkoutClothes().solution(n, lost, reserve)

}