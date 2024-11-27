package easy.q0263

fun main() {
    val sl = Solution()
    println(sl.isUgly(6))
    println(sl.isUgly(1))
    println(sl.isUgly(14))
    println(sl.isUgly(22))
}

private class Solution {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) return false
        var number = n
        while (number % 2 == 0) number /= 2
        while (number % 3 == 0) number /= 3
        while (number % 5 == 0) number /= 5
        return number == 1
    }
}