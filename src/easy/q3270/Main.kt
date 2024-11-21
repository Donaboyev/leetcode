package easy.q3270

fun main() {
    val sl = Solution()
    println(sl.generateKey(num1 = 1, num2 = 10, num3 = 1000))
    println(sl.generateKey(num1 = 987, num2 = 879, num3 = 798))
    println(sl.generateKey(num1 = 1, num2 = 2, num3 = 3))
    println(sl.generateKey(num1 = 1000, num2 = 2000, num3 = 3000))
}

private class Solution {
    fun generateKey(num1: Int, num2: Int, num3: Int): Int {
        var result = 0
        val (num11, num21, num31) = Triple(num1 / 1000, num2 / 1000, num3 / 1000)
        result += minOf(num11, num21, num31) * 1000
        val (num12, num22, num32) = Triple(num1 / 100 % 10, num2 / 100 % 10, num3 / 100 % 10)
        result += minOf(num12, num22, num32) * 100
        val (num13, num23, num33) = Triple(num1 / 10 % 10, num2 / 10 % 10, num3 / 10 % 10)
        result += minOf(num13, num23, num33) * 10
        val (num14, num24, num34) = Triple(num1 % 10, num2 % 10, num3 % 10)
        result += minOf(num14, num24, num34)
        return result
    }
}