//소수 : 2,3,5 로 나누어 떨어지지 않음
//1,2,3,5,7,11,13
fun main(args: Array<String>) {
    var Pnum = arrayOfNulls<Int>(50)

    var count: Int = 0
    var arr: Int = -1

    for (i in 2 until 50) {
        for (j in 2 until i) {
            if (i % j == 0) {//소수가아니다
                count++
                break
            }
        }
        if (count == 0) {
            Pnum[++arr] = i
        }
        count = 0;
    }
    for (i in 0..arr)
        println(Pnum[i])
}
