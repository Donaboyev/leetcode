package contest.feb172024.q100220

fun main() {
    val sl = Solution()
    println(sl.maxOperations(intArrayOf(3, 2, 1, 2, 3, 4)))
}

private class Solution {
    fun maxOperations(nums: IntArray): Int {
        val score = nums[0] + nums[1]
        var count = 1
        var i = 2
        while (i <= nums.size - 2) {
            val current = nums[i] + nums[i + 1]
            if (current != score) {
                return count
            }
            count++
            i += 2
        }
        return count
    }
}