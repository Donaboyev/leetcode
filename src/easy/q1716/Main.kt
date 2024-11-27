package easy.q1716

fun main() {
    val sl = Solution()
    println(sl.totalMoney(4))
    println(sl.totalMoney(10))
    println(sl.totalMoney(20))
}


private class Solution {
    fun totalMoney(n: Int): Int {
        var sum = 0
        var weekly = 0
        for (i in 1..7) {
            weekly += i
        }
        sum += weekly * (n / 7)
        for (i in 0 until (n / 7)) {
            sum += i * 7
        }
        for (i in 1..(n % 7)) {
            sum += i + n / 7
        }
        return sum
    }
}