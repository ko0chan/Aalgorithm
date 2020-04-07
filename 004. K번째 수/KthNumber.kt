

fun main(args: Array<String>){

    print("array Index 입력 : ")
    var size: Int = readLine()!!.toInt()

    print("array 원소 입력 : ")
    var arr = Array<Int>(size) {readLine()!!.toInt()}
    println(arr.contentDeepToString())

   // print(arr.slice(1 until 5))


    print("commands Index 입력 : ")
    var size2: Int = readLine()!!.toInt()

    var commands = Array<IntArray>(size2) {
        print("commands 원소 입력 : ")
        IntArray(3){readLine()!!.toInt()}}
    println(commands.contentDeepToString())



    var temp = arrayOfNulls<Int>(size2)
    for (i in 0 until size2) {
        temp[i] = arr.slice(commands[i][0] - 1 until commands[i][1])
            .sorted()[commands[i][2]-1] //.get() alt+enter
    }
    println(temp.contentDeepToString())




    for (i in 0 until size2){
        println(arr.contentDeepToString()+"를 "+commands[i][0]+"번째 부터"+commands[i][1]
        +"까지 자른 후 정렬합니다"+arr.slice(commands[i][0] - 1 until commands[i][1])
               .sorted()+"의"+commands[i][2]+"번째 숫자는 "+temp[i]+"입니다")
    }
}


