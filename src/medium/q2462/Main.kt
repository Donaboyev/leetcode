package medium.q2462

import java.util.PriorityQueue

fun main() {
    val sl = Solution()
    println(sl.totalCost(intArrayOf(17, 12, 10, 2, 7, 2, 11, 20, 8), 3, 4))
}

private class Solution {
    fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
        var sum: Long = 0
        if (candidates > costs.size) {
            for (item in costs) {
                sum += item
            }
            return sum
        }
        val left = PriorityQueue<Int>()
        val right = PriorityQueue<Int>()
        var currentLeft = 0
        var currentRight = costs.size - 1
        for (i in 0..3) {
            left.offer(costs[currentLeft])
            right.offer(costs[currentRight])
            currentLeft++
            currentRight--
        }
        for (i in 0 until k) {
            if (left.peek() > right.peek()) {
                sum += right.poll()
                currentLeft++
                if (currentLeft < costs.size) {
                    left.offer(costs[currentLeft])
                }
            } else {
                sum += right.poll()
                currentRight--
                if (currentRight > -1) {
                    right.offer(costs[currentRight])
                }
            }
        }
        return sum
    }
}