package easy.q1523

fun main() {
    val sl = Solution()
    println(sl.countOdds(3, 7))
    println(sl.countOdds(8, 10))
}


private class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var count = 0
        for (i in low..high) {
            if (i % 2 != 0) {
                count++
            }
        }
        return count
    }
}