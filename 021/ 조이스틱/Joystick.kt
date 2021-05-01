//https://programmers.co.kr/learn/courses/30/lessons/42860?language=kotlin
class Joystick {
    fun solution(name: String): Int {
        var answer = 0
        var move = name.length - 1

        // 총 위 아래 이동 수
        for (char in name) {
            answer += if (char - 'A' < 'Z' - char + 1) char - 'A' else 'Z' - char + 1
        }

        // 총 좌우 이동 수
        for (i in 0 until name.length) {
            var next = i + 1;
            while (next < name.length && name[next] == 'A') {
                next++
            }

            move = Math.min(move, 2 * i + name.length - next)

        }
        answer += move

        return answer
    }
}

fun main() {
    val name = "AAAB"
    print(Joystick().solution(name))
}