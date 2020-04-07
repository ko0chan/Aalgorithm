
fun main(args: Array<String>) {
   // var answer = arrayOf<String>("sun", "bed", "car")
    var answer = arrayOf<String>("abce", "abcd", "cdx")
    var temp = Array<String>(10) {""}
    var n: Int = 2

    for(i in 2..answer.size){
        for(j in 0..answer.size-i){
            if(answer[j].slice(n..n) > answer[j+1].slice(n..n)){
                temp[j] = answer[j]
                answer[j] = answer[j+1]
                answer[j+1] = temp[j]
            }
            else if(answer[j].slice(n..n) == answer[j+1].slice(n..n)){
                if(answer[j] > answer[j+1]){
                    temp[j] = answer[j]
                    answer[j] = answer[j+1]
                    answer[j+1] = temp[j]
                }
            }

        }
    }
    for (i in 1..answer.size){
        println(answer[i-1])
    }

}

