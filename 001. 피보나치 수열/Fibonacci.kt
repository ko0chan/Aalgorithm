import java.util.*

/*
피보나치 수는 0과 1로 시작한다
 */
fun main(args: Array<String>) {

    val sc: Scanner = Scanner(System.`in`)
    print("피보나치 수를 입력하세요(1~20) :")
    val fb = sc.nextInt()

    var fst = 1
    var sec = 1
    var result = fst + sec

    when(fb){
        1 -> fst
        2 -> sec
        else -> {
            for (i in 3..fb) {
                result = fst + sec
                fst = sec
                sec = result
            }
        }
    }
    print("\n $fb 번째 피보나치 수는 $result")
}