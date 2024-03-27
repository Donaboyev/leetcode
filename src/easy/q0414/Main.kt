package easy.q0414

import java.util.*
import kotlin.collections.HashSet
import kotlin.math.max


fun main() {
    val sl = Solution()
    println(sl.thirdMax(intArrayOf(3, 2, 1)))
}

private class Solution {
    fun thirdMax(nums: IntArray): Int {
        val sortedNums = TreeSet<Int>()
        for (i in nums.indices) {
            if (sortedNums.contains(nums[i])) {
                continue
            }
            if (sortedNums.size == 3) {
                if (sortedNums.first() < nums[i]) {
                    sortedNums.pollFirst()
                    sortedNums.add(nums[i])
                }
            } else {
                sortedNums.add(nums[i])
            }
        }
        if (sortedNums.size == 3) {
            return sortedNums.first()
        }
        return sortedNums.last()
    }
//    fun thirdMax(nums: IntArray): Int {
//        val minHeap = PriorityQueue<Int>()
//        val taken = HashSet<Int>()
//        for (i in nums.indices) {
//            if (taken.contains(nums[i])) {
//                continue
//            }
//            if (minHeap.size == 3) {
//                if (minHeap.peek() < nums[i]) {
//                    taken.remove(minHeap.poll())
//                    minHeap.add(nums[i])
//                    taken.add(nums[i])
//                }
//            } else {
//                minHeap.add(nums[i])
//                taken.add(nums[i])
//            }
//        }
//        if (minHeap.size == 1) {
//            return minHeap.peek()
//        } else if (minHeap.size == 2) {
//            val firstNum = minHeap.poll()
//            return max(firstNum, minHeap.peek())
//        }
//        return minHeap.peek()
//    }
//    fun thirdMax(nums: IntArray): Int {
//        Arrays.sort(nums)
//        if (nums.size < 3) {
//            return nums[nums.size - 1]
//        }
//        var countDifference = 0
//        for (i in nums.size - 1 downTo 1) {
//            if (nums[i] != nums[i - 1]) {
//                countDifference++
//                if (countDifference > 1) {
//                    return nums[i - 1]
//                }
//            }
//        }
//        return nums[nums.size - 1]
//    }
}