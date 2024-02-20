package medium.q2161

fun main() {
    val sl = Solution()
    println(sl.pivotArray(intArrayOf(9, 12, 5, 10, 14, 3, 10), 10).joinToString())
}

private class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val result = IntArray(nums.size)
        var j = nums.size - 1
        var currentI = 0
        var currentJ = nums.size - 1
        for (i in nums.indices) {
            if (nums[i] < pivot) {
                result[currentI++] = nums[i]
            }
            if (nums[j] > pivot) {
                result[currentJ--] = nums[j]
            }
            j--
        }
        for (k in currentI..currentJ) {
            result[k] = pivot
        }
        return result
    }
}