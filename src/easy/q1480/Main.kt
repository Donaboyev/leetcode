package easy.q1480

fun main() {
    val sl = Solution()
    println(sl.runningSum(intArrayOf(1, 2, 3, 4)).joinToString())
}


private class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1..<nums.size) {
            nums[i] += nums[i - 1]
        }
        return nums
    }
//    fun runningSum(nums: IntArray): IntArray {
//        if (nums.size < 2) {
//            return nums
//        }
//        for (i in 1 until nums.size) {
//            nums[i] = nums[i] + nums[i - 1]
//        }
//        return nums
//    }
}