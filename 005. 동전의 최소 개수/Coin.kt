fun main(args: Array<String>){

    var number: Int = readLine()!!.toInt()
    var price: Int = readLine()!!.toInt()
    var arr = Array<Int>(number) {readLine()!!.toInt()}
    var count = 0


    for (i in number-1 downTo 0){
        while (true) {
            if (arr[i] <= price) {
                price -= arr[i]
                count++

            }
            else
                break
        }

    }

   print(count)
}