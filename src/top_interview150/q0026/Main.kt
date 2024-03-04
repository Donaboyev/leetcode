package top_interview150.q0026

fun main() {
    val sl = Solution()
    println(sl.removeDuplicates(intArrayOf(1, 1, 2)))
}

private class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var currentIndex = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[currentIndex] = nums[i]
                currentIndex++
            }
        }
        return currentIndex
    }
//    fun removeDuplicates(nums: IntArray): Int {
//        var currentIndex = 0
//        var currentElement = nums[0]
//        for (i in nums.indices) {
//            if (currentElement == nums[i]) {
//                continue
//            }
//            currentIndex++
//            currentElement = nums[i]
//            nums[currentIndex] = currentElement
//        }
//        return currentIndex + 1
//    }

}