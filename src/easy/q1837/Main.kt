package easy.q1837

fun main() {
    val sl = Solution()
    println(sl.sumBase(34, 6))
    println(sl.sumBase(10, 10))
}


private class Solution {
    fun sumBase(n: Int, k: Int): Int {
        var sum = 0
        var number = n
        while (number > 0) {
            sum += number % k
            number /= k
        }
        return sum
    }
}