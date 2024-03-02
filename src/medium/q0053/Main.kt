package medium.q0053

fun main() {
    val sl = Solution()
    println(sl.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
}

private class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var currentSum = 0
        var maxSum = Int.MIN_VALUE
        for (i in nums.indices) {
            currentSum += nums[i]
            if (maxSum < currentSum) {
                maxSum = currentSum
            }
            if (currentSum < 0) {
                currentSum = 0
            }
        }
        return maxSum
    }
}