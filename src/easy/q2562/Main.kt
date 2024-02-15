package easy.q2562

import kotlin.math.log10
import kotlin.math.pow

fun main() {
    val sl = Solution()
    println(sl.findTheArrayConcVal(intArrayOf(5, 14, 13, 8, 12)))
}

private class Solution {
    fun findTheArrayConcVal(nums: IntArray): Long {
        var sum: Long = 0
        var i = 0
        var j = nums.size - 1
        while (i < j) {
            sum += cat(nums[i], nums[j])
            i++
            j--
        }
        if (i == j) {
            sum += nums[i]
        }
        return sum
    }

    private fun cat(left: Int, right: Int): Int {
        val d = log10(right.toDouble()).toInt() + 1
        return left * 10.0.pow(d.toDouble()).toInt() + right
    }

//    fun findTheArrayConcVal(nums: IntArray): Long {
//        var sum: Long = 0
//        var i = 0
//        var j = nums.size - 1
//        var current: String
//        while (i < j) {
//            current = "${nums[i]}${nums[j]}"
//            sum += current.toLong()
//            i++
//            j--
//        }
//        if (i == j) {
//            sum += nums[i]
//        }
//        return sum
//    }

//    fun findTheArrayConcVal(nums: IntArray): Long {
//        var sum: Long = 0
//        val size = nums.size
//        val middleIndex = if (size % 2 == 0) (size / 2 - 1) else size / 2
//        for (i in 0..middleIndex) {
//            val current = if (size - i - 1 > middleIndex) {
//                "${nums[i]}${nums[size - 1 - i]}"
//            } else {
//                "${nums[i]}"
//            }
//            sum += current.toLong()
//        }
//        return sum
//    }
}