//https://programmers.co.kr/learn/courses/30/lessons/42840?language=kotlin
class MockExam2 {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var fst = intArrayOf(1, 2, 3, 4, 5)
        var sec = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var thd = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var countList = IntArray(3) { 0 }
        for (i in answers.indices) {
            if (answers[i] == fst[i % fst.size]) countList[0]++
            if (answers[i] == sec[i % sec.size]) countList[1]++
            if (answers[i] == thd[i % thd.size]) countList[2]++
        }

        var maxList = mutableListOf<Int>()
        countList.max()?.let { max ->
            for (i in countList.indices) {
                println(countList[i])
                if (max == countList[i]) {
                    maxList.add(i + 1)
                }
            }
        }
        answer = maxList.toIntArray()

        return answer
    }
}

fun main() {
    val answers: IntArray = intArrayOf(1, 3, 2, 4, 2)

    print(MockExam2().solution(answers))
}