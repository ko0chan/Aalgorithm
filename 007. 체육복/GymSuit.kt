class GymSuit {
    //    fun temp(x: IntArray, y: IntArray) = when(x){
//        lost
//    }
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var array = IntArray(n) {0}
        var cnt = 0


        for (lost in lost) --array[lost-1]
        for (reserve in reserve) ++array[reserve-1]

        for (i in 1 until n) {
            if (array[i - 1] + array[i] == 0) {
                array[i - 1] = 0
                array[i] = 0
            }
        }
        for (i in 0 until n){
            if(array[i] >= 0 )
                cnt++
        }
        answer = cnt
        print(answer)

        return answer
    }
}


fun main(args: Array<String>) {
    var n = 5
    var lost = intArrayOf(2,4)
    var reserve = intArrayOf(1,3,5)

    GymSuit().solution(n,lost, reserve)

}
