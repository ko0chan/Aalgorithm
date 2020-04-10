//백준 5585번 https://www.acmicpc.net/problem/5585
fun main(args: Array<String>){
    var pay = 1000
    var price = readLine()!!.toInt()
    var change = 1000 - price

    var cnt = 0
    while (change != 0) {
        when {
            change / 500 == 1 -> {
                cnt += change / 500
                change %= 500

            }
            change / 100 >= 1 -> {
                cnt += change / 100
                change %= 100
            }
            change / 50 >= 1 -> {
                cnt += change / 50
                change %= 50
            }
            change / 10 >= 1 -> {
                cnt += change / 10
                change %= 10
            }
            change / 5 >= 1 -> {
                cnt += change / 5
                change %= 5
            }
            change / 1 >= 1 -> {
                cnt += change / 1
                change %= 1
            }
        }
    }
    print(cnt)
}