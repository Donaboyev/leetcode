package easy.q0448

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sl = Solution()
    println(sl.findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
}

private class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val existingNumbers = IntArray(nums.size)
        for (i in nums.indices) {
            existingNumbers[nums[i] - 1] = 1
        }
        val result = ArrayList<Int>()
        for (i in existingNumbers.indices) {
            if (existingNumbers[i] == 0) {
                result.add(i + 1)
            }
        }
        return result
    }
//    fun findDisappearedNumbers(nums: IntArray): List<Int> {
//        val list = LinkedList<Int>()
//        val n = nums.size
//        val frequency = HashMap<Int, Int>()
//        for (i in nums.indices) {
//            frequency[nums[i]] = frequency.getOrDefault(nums[i], 0) + 1
//        }
//        for (i in 1..n) {
//            if (!frequency.contains(i)) {
//                list.add(i)
//            }
//        }
//        return list
//    }
}