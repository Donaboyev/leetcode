package easy.q1051

import java.util.*

fun main() {
    val sl = Solution()
    println(sl.heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
}

private class Solution {
    fun heightChecker(heights: IntArray): Int {
        val heightFrequency = IntArray(101)
        for (i in heights.indices) {
            heightFrequency[heights[i]]++
        }
        var count = 0
        var currentHeight = 0
        for (i in heights.indices) {
            while (heightFrequency[currentHeight] == 0) {
                currentHeight++
            }
            if (currentHeight != heights[i]) {
                count++
            }
            heightFrequency[currentHeight]--
        }
        return count
    }
//    fun heightChecker(heights: IntArray): Int {
//        var count = 0
//        val array = IntArray(heights.size)
//        for (i in array.indices) {
//            array[i] = heights[i]
//        }
//        Arrays.sort(heights)
//        for (i in array.indices) {
//            if (array[i] != heights[i]) {
//                count++
//            }
//        }
//        return count
//    }
}