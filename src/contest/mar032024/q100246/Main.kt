package contest.mar032024.q100246

fun main() {
    val sl = Solution()
    println(sl.resultArray(intArrayOf(2, 1, 3, 3)).joinToString())
}

private class Solution {
    fun resultArray(nums: IntArray): IntArray {
        val array1 = mutableListOf(nums[0])
        val array2 = mutableListOf(nums[1])
        val result = IntArray(nums.size)
        fun greaterCount(arr: List<Int>, value: Int): Int {
            return arr.count {
                it > value
            }
        }
        for (i in 2 until nums.size) {
            val first = greaterCount(array1, nums[i])
            val second = greaterCount(array2, nums[i])
            when {
                first > second -> array1.add(nums[i])
                first < second -> array2.add(nums[i])
                else -> {
                    if (array2.size < array1.size) {
                        array2.add(nums[i])
                    } else {
                        array1.add(nums[i])
                    }
                }
            }
        }
        for (i in 0 until array1.size) {
            result[i] = array1[i]
        }
        for (j in 0 until array2.size) {
            result[j + array1.size] = array2[j]
        }
        return result
    }
}