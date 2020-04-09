class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var fst = intArrayOf(1,2,3,4,5)
        var sec = intArrayOf(2,1,2,3,2,4,2,5)
        var thd = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        var count = IntArray(3)
        var arr = mutableListOf<Int>()

        for (i in 0 until answers.size){
            if (answers[i] == fst[i % fst.size])
                count[0]++;
            if (answers[i] == sec[i % sec.size])
                count[1]++;
            if (answers[i] == thd[i % thd.size])
                count[2]++;
        }
        if (count.max() == count[0]) arr.add(1)
        if (count.max() == count[1]) arr.add(2)
        if (count.max() == count[2]) arr.add(3)
        
        answer = arr.toIntArray()
        return answer
    }
}

fun main(args: Array<String>) {
    var array = intArrayOf(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5)

    Solution().solution(array)

}