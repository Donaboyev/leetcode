package contest.mar022024.q100231

fun main() {
    val sl = Solution()
    println(sl.minOperations(intArrayOf(2, 11, 10, 1, 3), 10))
}

private class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] < k) {
                count++
            }
        }
        return count
    }
}