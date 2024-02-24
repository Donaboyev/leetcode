package easy.q2909

fun main() {
    val sl = Solution()
    println(sl.minimumSum(intArrayOf(8, 6, 1, 5, 3)))
}

private class Solution {
    fun minimumSum(nums: IntArray): Int {
        var minimumSum = -1
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                if (nums[i] >= nums[j]) {
                    continue
                }
                for (k in j + 1 until nums.size) {
                    if (nums[j] <= nums[k]) {
                        continue
                    }
                    val currentSum = nums[i] + nums[j] + nums[k]
                    if (minimumSum == -1) {
                        minimumSum = currentSum
                    } else if (minimumSum > currentSum) {
                        minimumSum = currentSum
                    }

                }
            }
        }
        return minimumSum
    }
}