package contest.mar032024.q100243

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sl = Solution()
    println(sl.resultArray(intArrayOf(2, 1, 3)).joinToString())
}

private class Solution {
    fun resultArray(nums: IntArray): IntArray {
        val array1 = mutableListOf(nums[0])
        val array2 = mutableListOf(nums[1])
        val result = IntArray(nums.size)
        for (i in 2 until nums.size) {
            if (array1.last() > array2.last()) {
                array1.add(nums[i])
            } else {
                array2.add(nums[i])
            }
        }
        println(array1)
        println(array2)
        for (i in 0 until array1.size) {
            result[i] = array1[i]
        }
        for (j in 0 until array2.size) {
            result[j + array1.size] = array2[j]
        }
        return result
    }
}