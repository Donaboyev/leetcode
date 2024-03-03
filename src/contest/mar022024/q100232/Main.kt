package contest.mar022024.q100232

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sl = Solution()
    println(
        sl.minOperations(
            intArrayOf(999_999_999, 999_999_999, 999_999_999),
            1_000_000_000
        )
    )
    println(
        sl.minOperations(
            intArrayOf(15, 90, 76, 23, 66, 28, 37, 16, 45),
            91
        )
    )
}

private class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val heap = PriorityQueue<Int>()
        nums.forEach {
            heap.add(it)
        }
        var count = 0
        while (heap.peek() != null && heap.peek() < k) {
            if (heap.size < 2) {
                if (heap.peek() < k) {
                    count++
                }
                break
            }
            count++
            val minimumValue = heap.poll()
            val maximumValue = heap.poll()
            val updated = 2 * minimumValue + maximumValue
            if (updated < 0) {
                continue
            }
            heap.add(updated)
        }
        return count
    }
//    fun minOperations(nums: IntArray, k: Int): Int {
//        Arrays.sort(nums)
//        println(nums.joinToString())
//        var count = 0
//        var i = 0
//        while (i < nums.size ) {
//            println(nums.joinToString())
//            if (nums[i] < 0) {
//                i++
//                continue
//            }
//            if (nums[i] >= k) {
//                i++
//                continue
//            }
//            if (i == nums.size - 1 && nums[i] < k) {
//                count++
//                break
//            }
//            val minValue = min(nums[i], nums[i + 1])
//            val maxValue = max(nums[i], nums[i + 1])
//            val updated = minValue * 2 + maxValue
//            nums[i + 1] = updated
//            println("updated $updated, min: $minValue, max: $maxValue")
//            i++
//            count++
//        }
//        return count
//    }
}