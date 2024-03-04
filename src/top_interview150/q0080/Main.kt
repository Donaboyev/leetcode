package top_interview150.q0080

fun main() {
    val sl = Solution()
    println(sl.removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)))
}

private class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var currentIndex = 0
        var lastCount = 0
        var lastElement = nums[0]
        for (i in nums.indices) {
            if (lastElement == nums[i]) {
                lastCount++
                if (lastCount < 3) {
                    nums[currentIndex] = nums[i]
                    lastElement = nums[i]
                    currentIndex++
                }
            } else {
                lastCount = 1
                lastElement = nums[i]
                nums[currentIndex] = nums[i]
                currentIndex++
            }
        }
        return currentIndex
    }
}