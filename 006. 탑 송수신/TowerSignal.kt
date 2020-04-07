//프로그래머스 - 탑

class TowerSignal {

    fun solution(heights: IntArray): IntArray {
        var answer= IntArray(heights.size)

        answer[0] = 0
        for(i in heights.size-1 downTo 1){// i: 4-1
            for (j in i-1 downTo 0){ // j: 3-0
                if (heights[j] > heights[i]){
                    answer[i] = j+1
                    break
                }
                if(j == 0){answer[i] = 0}
            }
         }

        return answer

    }
}

fun main(args: Array<String>){
    var heights = intArrayOf(6,9,5,7,4)
   // print(TowerSignal().solution(heights))
    (TowerSignal().solution(heights)).forEach { print(it) }

}