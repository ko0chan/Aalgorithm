class SumIntegers {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        if (a<=b){
            for (i in a..b){
              answer += i
            }
        }
        else{
            for (i in b..a){
                answer+= i
            }
        }

        return answer
    }
}

fun main(args: Array<String>) {
    var a=3
    var b=5

    SumIntegers().solution(a,b)

}