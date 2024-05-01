package easy.q0035

fun main() {
    val sl = Solution()
    println(sl.searchInsert(intArrayOf(1, 3, 5, 6), 5))
}

private class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val middleIndex = nums.size / 2
        if (target == nums[middleIndex]) {
            return middleIndex
        }
        if (target > nums[middleIndex]) {

        }
        return 0
    }
}