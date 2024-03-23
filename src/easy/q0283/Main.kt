package easy.q0283

fun main() {
    val sl = Solution()
    println(sl.moveZeroes(intArrayOf(0, 1, 0, 3, 12)))
}

private class Solution {
    fun moveZeroes(nums: IntArray) {
        var nonZeroIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                val temp = nums[i]
                nums[i] = nums[nonZeroIndex]
                nums[nonZeroIndex] = temp
                nonZeroIndex++
            }
        }
    }
//    fun moveZeroes(nums: IntArray) {
//        if (nums.size < 2) {
//            return
//        }
//        var nonZeroIndex = 0
//        for (i in nums.indices) {
//            if (nums[i] != 0) {
//                continue
//            }
//            val temp = nums[i]
//            nums[i] = nums[nonZeroIndex]
//            nums[nonZeroIndex] = temp
//            nonZeroIndex++
//        }
//    }
}