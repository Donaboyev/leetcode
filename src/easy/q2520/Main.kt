package easy.q2520

fun main() {
    val sl = Solution()
    println(sl.countDigits(7))
    println(sl.countDigits(121))
    println(sl.countDigits(1248))
}

private class Solution {
    fun countDigits(num: Int): Int {
        var number = num
        var count = 0
        while (number > 0) {
            val digit = number % 10
            if (num % digit == 0) {
                count++
            }
            number /= 10
        }
        return count
    }
}