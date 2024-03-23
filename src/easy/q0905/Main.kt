package easy.q0905

fun main() {
    val sl = Solution()
    println(sl.sortArrayByParity(intArrayOf(3, 1, 2, 4)).joinToString())
}


private class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var leftIndex = 0
        var rightIndex = nums.size - 1
        while (leftIndex <= rightIndex) {
            if (nums[leftIndex] % 2 == 0) {
                leftIndex++
            } else {
                val temp = nums[leftIndex]
                nums[leftIndex] = nums[rightIndex]
                nums[rightIndex] = temp
                rightIndex--
            }
        }
        return nums
    }
//    fun sortArrayByParity(nums: IntArray): IntArray {
//        var lastEvenIndex = 0
//        for (i in nums.indices) {
//            if (nums[i] % 2 == 0) {
//                val temp = nums[i]
//                nums[i] = nums[lastEvenIndex]
//                nums[lastEvenIndex] = temp
//                lastEvenIndex++
//            }
//        }
//        return nums
//    }
}

