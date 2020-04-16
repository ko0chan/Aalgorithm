import java.text.FieldPosition
import java.util.*
import kotlin.collections.first as first1
// 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/42583
class Solution {
    //fun test(var weight: Int, var location: Int)
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var readyTruck: Queue<Pair<Int,Int>> = LinkedList<Pair<Int,Int>>()
        var movingTruck: Queue<Pair<Int,Int>> = LinkedList<Pair<Int,Int>>()
        var totalWeight = 0
        var time = 0

        for (weight in truck_weights){
            readyTruck.offer(Pair(weight,0))
        }

        totalWeight = readyTruck.peek().first
        movingTruck.offer(readyTruck.poll())
        time++


        while (movingTruck.size !=0){
            for (moving in movingTruck) {
                moving.second.plus(1)
           //     println(moving.second);
            }
            if (movingTruck.peek().second >= bridge_length){
                totalWeight -= movingTruck.poll().first
            }
            if (readyTruck.size !=0) {
                if (readyTruck.peek().first + totalWeight <= weight) {
                    totalWeight += readyTruck.peek().first
                    movingTruck.offer(readyTruck.poll())
                }
            }
            time++
        }
        return time
    }
}

fun main(args: Array<String>) {
    var bridge_length = 2
    var weight = 10
    var truck_weights = intArrayOf(7,4,5,6)

    print(Solution().solution(bridge_length,weight,truck_weights))
}