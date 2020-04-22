// 프로그래머스 '이상한 문자 만들기'
// https://programmers.co.kr/learn/courses/30/lessons/12930
class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        var arr = s.split(" ")
        var arr2 = mutableListOf<String>()


        for (array in arr){
            for (j in array.indices){
                if (j % 2 == 0){
                    answer += array[j].toUpperCase().toString()
                }
                else {
                    answer += array[j].toLowerCase().toString()
                }
            }
            arr2.add(answer)
            answer=""
        }
        answer = arr2.joinToString(" ")
        
        return answer
    }
}

fun main(args: Array<String>) {
    var s = "try hello world"
    Solution().solution(s)
}