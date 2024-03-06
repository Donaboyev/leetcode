package top_interview150.q0189

fun main() {
    val sl = Solution()
    println(sl.rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3))
    println(sl.rotate(intArrayOf(-1), 2))
    println(sl.rotate(intArrayOf(-1, -3), 4))
}

private class Solution {
    fun rotate(nums: IntArray, k: Int) {
        if (nums.size < 2) {
            return
        }
        var step = k
        if (nums.size < k) {
            step /= nums.size
        }
        var i = 0
        var j = nums.size - 1 - step
        while (i <= j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
        i = nums.size - step
        j = nums.size - 1
        while (i <= j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
        i = 0
        j = nums.size-1
        while (i <= j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
    }

//    fun rotate(nums: IntArray, k: Int) {
//        val result = IntArray(nums.size)
//        for (i in nums.indices) {
//            val index =
//                if (i + k >= nums.size) i + k - (if ((i + k) / nums.size > 0) (i + k) / nums.size else 1) * nums.size else i + k
//            result[index] = nums[i]
//        }
//        for (i in nums.indices) {
//            nums[i] = result[i]
//        }
//        println(nums.joinToString())
//    }
}