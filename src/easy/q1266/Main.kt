package easy.q1266

import kotlin.math.abs
import kotlin.math.max

fun main() {
    val sl = Solution()
    println(
        sl.minTimeToVisitAllPoints(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(3, 4),
                intArrayOf(-1, 0)
            )
        )
    )
}


private class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        if (points.size < 2) {
            return 0
        }
        var time = 0
        for (i in 0 until points.size - 1) {
            val xStep = abs(points[i + 1][0] - points[i][0])
            val yStep = abs(points[i + 1][1] - points[i][1])
            time += max(xStep, yStep)
        }
        return time
    }
}