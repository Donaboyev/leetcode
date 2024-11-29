package easy.q0507

fun main() {
    val sl = Solution()
    println(sl.checkPerfectNumber(28))
    println(sl.checkPerfectNumber(7))
}

private class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        if (num == 1) return false
        var sum = 0
        for (i in 1 until num) {
            if (num % i == 0) {
                sum += i
            }
        }
        return sum == num
    }
}