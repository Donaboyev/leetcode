package easy.q3024

fun main() {
    val sl = Solution()
    println(sl.triangleType(intArrayOf(8, 4, 4)))
}

private class Solution {
    fun triangleType(nums: IntArray): String {
        return when {
            nums[0] == nums[1] && nums[0] == nums[2] -> "equilateral"
            else -> {
                if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
                    if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                        return "isosceles"
                    }
                    return "scalene"
                }
                "none"
            }
        }
    }
}