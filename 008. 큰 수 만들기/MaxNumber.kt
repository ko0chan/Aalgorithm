

class MaxNumber {
    fun solution(number: String, k: Int): String {
        var answer = ""
        //var array: CharArray = number.toCharArray()
        var max: Char
        var startpoint: Int = 0
        for (i in 0 until number.length-k){
            max = '0'
            for (j in startpoint .. k+i) {
                if (max < number[j]) {
                    max = number[j]
                    startpoint=j+1
                }
            }
            answer+=max
            if(answer.length == number.length-k)
                break
        }

        return answer
    }
}

fun main(args: Array<String>) {
    var num = "4177252841"
    var k = 4

    val result = MaxNumber().solution(num,k)
    print(result)
}
//number	   k	return
//1924	      3	     9              -1
//41
// 7
// 41
// 7            7
// 7
// 252841  4     75841



