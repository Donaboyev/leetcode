package easy.q1295

import kotlin.math.floor
import kotlin.math.log10

fun main() {
    val sl = Solution()
    println(sl.findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
}


private class Solution {
    fun findNumbers(nums: IntArray): Int {
        var evenNumbers = 0
        for (i in nums.indices) {
            if (nums[i] in 10..99 || nums[i] in 1000..9999 || nums[i] == 100000) {
                evenNumbers++
            }
        }
        return evenNumbers
    }
//    fun findNumbers(nums: IntArray): Int {
//        var evenNumbers = 0
//        for (i in nums.indices) {
//            val digitCount = floor(log10(nums[i].toFloat())).toInt() + 1
//            if (digitCount % 2 == 0) {
//                evenNumbers++
//            }
//        }
//        return evenNumbers
//    }
//    fun findNumbers(nums: IntArray): Int {
//        var evenNumbers = 0
//        for (i in nums.indices) {
//            var current = nums[i]
//            var digitCount = 0
//            while (current > 0) {
//                current /= 10
//                digitCount++
//            }
//            if (digitCount % 2 == 0) {
//                evenNumbers++
//            }
//        }
//        return evenNumbers
//    }
//    fun findNumbers(nums: IntArray): Int {
//        var evenNumbers = 0
//        for (i in nums.indices) {
//            if (nums[i].toString().length % 2 == 0) {
//                evenNumbers++
//            }
//        }
//        return evenNumbers
//    }
}