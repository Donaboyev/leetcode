package q0279

import kotlin.math.sqrt

fun main() {
    val sl = Solution()
    println(sl.numSquares(12))
}

private class Solution {
    fun numSquares(n: Int): Int {
        var current: Int = n
        val max: Int = sqrt(current.toDouble()).toInt()
        println(max)
        current -= max * max
        println(current)
        val max2: Int = sqrt(current.toDouble()).toInt()
        println(max2)
        current -= max2
        return n
    }
}