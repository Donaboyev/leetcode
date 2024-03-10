package contest.mar102024.q100247

import java.util.*

fun main() {
    val sl = Solution()
    println(sl.maximumHappinessSum(intArrayOf(1, 2, 3), 2))
}

private class Solution {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        var maxSum = 0L
        Arrays.sort(happiness)
        for (i in 0..<k) {
            val currentHappiness = happiness[happiness.size - 1 - i] - i
            if (currentHappiness < 0) {
                break
            }
            maxSum += currentHappiness
        }
        return maxSum
    }
}