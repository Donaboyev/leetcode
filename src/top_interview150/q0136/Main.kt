package top_interview150.q0136

fun main() {
    val sl = Solution()
    println(sl.singleNumber(intArrayOf(2, 2, 1)))
}

private class Solution {
    fun singleNumber(nums: IntArray): Int {
        for (i in nums.indices) {
            var count = 0
            for (j in nums.indices) {
                if (nums[i] == nums[j]) {
                    count++
                    if (count > 1) {
                        break
                    }
                }
            }
            if (count == 1) {
                return nums[i]
            }
        }
        return -1
    }

}