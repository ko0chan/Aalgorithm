class MaxNumber2 {
    fun solution(number: String, k: Int): String {
        var answer = ""

        var max: Char
        var startpoint = 0
        for (i in 0 until number.length - k) {
            max = number[startpoint]
            if (max != '9') {
                for (j in startpoint until k + i) {
                    if (max < number[j + 1]) {
                        max = number[j + 1]
                        startpoint = j + 1
                        if (max == '9') {
                            break
                        }
                    }
                }
            }
            startpoint++
            answer += max
        }

        return answer
    }
}

fun main() {
    val number = "4177252841"
    val k = 4
    print(MaxNumber2().solution(number, k))
}
