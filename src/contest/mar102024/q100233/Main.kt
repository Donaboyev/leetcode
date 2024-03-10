package contest.mar102024.q100233

import java.util.*

fun main() {
    val sl = Solution()
    println(sl.minimumBoxes(intArrayOf(1, 3, 2), intArrayOf(4, 3, 1, 5, 2)))
}

private class Solution {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        var totalSum = 0
        for (item in apple) {
            totalSum += item
        }
        Arrays.sort(capacity)
        var count = 0
        while (totalSum > 0) {
            totalSum -= capacity[capacity.size - 1 - count]
            count++
        }
        return count
    }
}