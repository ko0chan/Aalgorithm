class Solution {
    fun solution(seoul: Array<String>): String {

        return "김서방은 "+seoul.indexOf("Kim")+"에 있다"
    }
}

fun main(args: Array<String>) {
    var seoul = arrayOf("Jane", "Kim")

    Solution().solution(seoul)

}