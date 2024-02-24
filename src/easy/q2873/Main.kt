package easy.q2873

import kotlin.math.log10
import kotlin.math.pow

fun main() {
    val sl = Solution()
    println(sl.maximumTripletValue(intArrayOf(1,10,3,4,19)))
}

private class Solution {
    fun maximumTripletValue(nums: IntArray): Long {
        val maxLeft = IntArray(nums.size)
        val maxRight = IntArray(nums.size)
        var max = 0
        for (i in nums.indices) {
            maxLeft[i] = max
            max = maxOf(max, nums[i])
        }
        max = 0
        for (i in nums.indices.reversed()) {
            maxRight[i] = max
            max = maxOf(max, nums[i])
        }

        var ret = 0L
        for (i in 1 until nums.size - 1) {
            val left = maxLeft[i]
            if (left <= nums[i]) continue
            val right = maxRight[i]
            ret = maxOf(ret, (left.toLong() - nums[i]) * right)
        }
        return ret
    }

//    fun maximumTripletValue(nums: IntArray): Long {
//        var maxValue: Long = 0
//        for (i in 0 until nums.size - 2) {
//            for (j in i + 1 until nums.size - 1) {
//                for (k in j + 1 until nums.size) {
//                    val current = (nums[i] - nums[j]) * nums[k].toLong()
//                    if (maxValue < current) {
//                        maxValue = current
//                    }
//                }
//            }
//        }
//        return maxValue
//    }
}