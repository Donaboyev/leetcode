package easy.q0485

fun main() {
    val sl = Solution()
    println(sl.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
}

private class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxCount = 0
        var currentCount = 0
        for (i in nums.indices) {
            if (nums[i] == 1) {
                currentCount++
                if (currentCount > maxCount) {
                    maxCount = currentCount
                }
            } else {
                currentCount = 0
            }
        }
        return maxCount
    }
}