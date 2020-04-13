fun main(args: Array<String>) {

    var P_num = readLine()!!.toInt()
    var time = (readLine()!!.split(" ")).map(String::toInt).sorted()

    var sum = 0
    var result = 0

    for (i in 0 until P_num) {
        sum += time[i]
        result += sum
    }
    print(result)

}