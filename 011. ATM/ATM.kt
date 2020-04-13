import java.util.*
//백준 ATM 11399번 https://www.acmicpc.net/problem/11399
fun main(args: Array<String>) {
    var P_num = readLine()!!.toInt()
//    var P_time = Array<Int>(P_num){ readLine()!!.toInt()}.sorted()
    var P_time = Array<Int>(P_num){0}
    val input = Scanner(System.`in`)
    for (i in 0 until P_num){
        P_time[i] = input.nextInt()
    }

    P_time.sort()

    var sum = 0
    var result = 0
    for (i in 0 until P_num) {
        sum += P_time[i]
        result += sum
    }
//    for (i in P_num downTo 1) {
//        for (j in 0 .. P_time.size - i) {
//            result += P_time[j]
//    }


    print(result)
}