package daily_challenges.d02052024q2441

import kotlin.math.abs

fun main() {
    val sl = Solution()
    println(sl.findMaxK(intArrayOf(-1, 2, -3, 3)))
}

private class Solution {

    fun findMaxK(nums: IntArray): Int {
        var ans = -1
        for (i in nums) {
            for (j in nums) {
                if (i == -j) {
                    ans = maxOf(ans, abs(i))
                }
            }
        }
        return ans
    }

//    fun findMaxK(nums: IntArray): Int {
//        var result = -1
//        val set = HashSet<Int>()
//        nums.forEach {
//            set.add(it)
//            if (set.contains(-it) && abs(it) > result) {
//                result = abs(it)
//            }
//        }
//        return result
//    }

//    fun findMaxK(nums: IntArray): Int {
//        nums.sort()
//        var left = 0
//        var right = nums.size - 1
//        while (left <= right) {
//            when {
//                nums[left] + nums[right] > 0 -> right--
//                nums[left] + nums[right] < 0 -> left++
//                else -> return nums[right]
//            }
//        }
//        return -1
//    }

    /**
     * It's my first approach
     */

//    fun findMaxK(nums: IntArray): Int {
//        var maxK = Int.MIN_VALUE
//        val map = HashMap<Int, Int>()
//        for (i in nums.indices) {
//            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
//            if (map.containsKey(nums[i]) && map.containsKey(nums[i] * -1)) {
//                maxK = maxOf(maxK, nums[i], nums[i] * -1)
//            }
//        }
//        return if (maxK == Int.MIN_VALUE) -1 else maxK
//    }

}