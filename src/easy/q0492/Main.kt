package easy.q0492

import kotlin.math.sqrt

fun main() {
    val sl = Solution()
    println(sl.constructRectangle(4).toList())
}

private class Solution {
    fun constructRectangle(area: Int): IntArray {
        var w = sqrt(area.toDouble()).toInt()
        while (area % w != 0) {
            w--
        }
        return intArrayOf(area / w, w)
    }
}