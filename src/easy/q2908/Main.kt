package easy.q2908

fun main() {
    val sl = Solution()
    println(sl.minimumSum(intArrayOf(8, 6, 1, 5, 3)))
}

private class Solution {

    fun minimumSum(nums: IntArray): Int {
        val minLeft = IntArray(nums.size)
        val minRight = IntArray(nums.size)
        var min = Int.MAX_VALUE
        for (i in nums.indices) {
            minLeft[i] = min
            min = minOf(min, nums[i])
        }
        min = Int.MAX_VALUE
        for (i in nums.indices.reversed()) {
            minRight[i] = min
            min = minOf(min, nums[i])
        }
        var ret = -1
        for (i in 1 until nums.size - 1) {
            val left = minLeft[i]
            val right = minRight[i]
            if (left < nums[i] && right < nums[i]) {
                val sum = left + nums[i] + right
                ret = if (ret == -1) sum
                else minOf(ret, sum)
            }
        }
        return ret
    }

//    fun minimumSum(nums: IntArray): Int {
//        var minSum = Integer.MAX_VALUE
//        for (i in 0 until nums.size - 2) {
//            for (j in i + 1 until nums.size - 1) {
//                if (nums[i] >= nums[j]) {
//                    break
//                }
//                for (k in j + 1 until nums.size) {
//                    if (nums[k] < nums[j]) {
//                        minSum = min(minSum, nums[i] + nums[j] + nums[k])
//                    }
//                }
//            }
//        }
//        return if (minSum == Integer.MAX_VALUE) -1 else minSum
//    }

//    fun minimumSum(nums: IntArray): Int {
//        var result = Int.MAX_VALUE
//        for (i in 1 until nums.size - 1) {
//            val current = nums[i]
//            val left = minimum(nums, 0, i - 1)
//            if (current <= left) {
//                continue
//            }
//            val right = minimum(nums, i + 1, nums.size - 1)
//            if (current <= right) {
//                continue
//            }
//            result = min(result,left + current + right)
//        }
//        return if (result == Int.MAX_VALUE) -1 else result
//    }

//    fun minimum(numbers: IntArray, startIndex: Int, endIndex: Int): Int {
//        var minValue = numbers[startIndex]
//        for (i in startIndex..endIndex) {
//            if (numbers[i] < minValue) {
//                minValue = numbers[i]
//            }
//        }
//        return minValue
//    }

//    fun minimumSum(nums: IntArray): Int {
//        var minimumSum = -1
//        for (i in 0 until nums.size - 2) {
//            for (j in i + 1 until nums.size - 1) {
//                if (nums[i] >= nums[j]) {
//                    continue
//                }
//                for (k in j + 1 until nums.size) {
//                    if (nums[j] <= nums[k]) {
//                        continue
//                    }
//                    val currentSum = nums[i] + nums[j] + nums[k]
//                    if (minimumSum == -1) {
//                        minimumSum = currentSum
//                    } else if (minimumSum > currentSum) {
//                        minimumSum = currentSum
//                    }
//
//                }
//            }
//        }
//        return minimumSum
//    }
}