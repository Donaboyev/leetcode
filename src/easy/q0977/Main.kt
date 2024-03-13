package easy.q0977

import java.util.*
import kotlin.math.abs
import kotlin.math.absoluteValue

fun main() {
    val sl = Solution()
    println(sl.sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).joinToString())
}


private class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var i = nums.size - 1
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            if (abs(nums[left]) > abs(nums[right])) {
                result[i--] = nums[left] * nums[left]
                left++
            } else {
                result[i--] = nums[right] * nums[right]
                right--
            }
        }
        return result
    }
//    fun sortedSquares(nums: IntArray): IntArray {
//        val result = IntArray(nums.size)
//        var i = nums.size - 1
//        var left = 0
//        var right = nums.size - 1
//        while (left <= right) {
//            if (nums[left].absoluteValue > nums[right].absoluteValue) {
//                result[i] = nums[left] * nums[left]
//                left++
//                i--
//            } else {
//                result[i] = nums[right] * nums[right]
//                right--
//                i--
//            }
//        }
//        return result
//    }
//    fun sortedSquares(nums: IntArray): IntArray {
//        for (i in nums.indices) {
//            nums[i] = nums[i] * nums[i]
//        }
//        Arrays.sort(nums)
//        return nums
//    }
}
