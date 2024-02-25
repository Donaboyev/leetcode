package easy.q2481

fun main() {
    val sl = Solution()
    println(sl.numberOfCuts(3))
}


private class Solution {
    fun numberOfCuts(n: Int): Int {
        if (n == 1) {
            return 0
        }
        if (n % 2 == 0) {
            return n / 2
        }
        return n
    }
}