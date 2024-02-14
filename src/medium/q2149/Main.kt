package medium.q2149

fun main() {
    val sl = Solution()
    println(sl.rearrangeArray(intArrayOf(3, 1, -2, -5, 2, -4)).joinToString())
}

private class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var pIndex = 0
        var nIndex = 1
        for (item in nums) {
            if (item < 0) {
                result[nIndex] = item
                nIndex += 2
            } else {
                result[pIndex] = item
                pIndex += 2
            }
        }
        return result
    }
//    fun rearrangeArray(nums: IntArray): IntArray {
//        val positives = IntArray(nums.size)
//        val negatives = IntArray(nums.size)
//        var pIndex = 0
//        var nIndex = 0
//        for (item in nums) {
//            if (item < 0) {
//                negatives[nIndex++] = item
//            } else {
//                positives[pIndex++] = item
//            }
//        }
//        pIndex = 0
//        nIndex = 0
//        for (index in nums.indices) {
//            if (index % 2 == 0) {
//                nums[index] = positives[pIndex++]
//            } else {
//                nums[index] = negatives[nIndex++]
//            }
//        }
//        return nums
//    }
//    fun rearrangeArray(nums: IntArray): IntArray {
//        val positives = IntArray(nums.size)
//        val negatives = IntArray(nums.size)
//        val result = IntArray(nums.size)
//        var pIndex = 0
//        var nIndex = 0
//        for (item in nums) {
//            if (item < 0) {
//                negatives[nIndex++] = item
//            } else {
//                positives[pIndex++] = item
//            }
//        }
//        pIndex = 0
//        nIndex = 0
//        for (index in nums.indices) {
//            if (index % 2 == 0) {
//                result[index] = positives[pIndex++]
//            } else {
//                result[index] = negatives[nIndex++]
//            }
//        }
//        return result
//    }
}