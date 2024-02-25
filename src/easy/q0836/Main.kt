package easy.q0836

import kotlin.math.abs

fun main() {
    val sl = Solution()
    println(
        sl.isRectangleOverlap(
            intArrayOf(-7, -3, 10, 5),
            intArrayOf(-6, -5, 5, 10)
        )
    )
}


private class Solution {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        val x11 = abs(rec1[0])
        val y11 = abs(rec1[1])
        val x12 = abs(rec1[2])
        val y12 = abs(rec1[3])
        val x21 = abs(rec2[0])
        val y21 = abs(rec2[1])
        val x22 = abs(rec2[2])
        val y22 = abs(rec2[3])
        return ((x21 in x11..<x12) || (x22 in x11..<x12)) &&
                (y21 in y11..<y12) || (y22 in y11..<y12)
    }
}