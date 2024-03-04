package top_interview150.q0088

fun main() {
    val sl = Solution()
    println(sl.merge(intArrayOf(0, 0, 0, 0, 0), 0, intArrayOf(1, 2, 3, 4, 5), 5))
}

private class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var first = nums1.size - m - 1
        var second = n - 1
        for (i in nums1.size - 1 downTo 0) {
            when {
                first >= 0 && second >= 0 -> {
                    println("i: $i, first: $first, second: $second")
                    if (nums1[first] > nums2[second]) {
                        nums1[i] = nums1[first]
                        first--
                    } else {
                        nums1[i] = nums2[second]
                        second--
                    }
                }

                first < 0 && second >= 0 -> {
                    nums1[i] = nums2[second]
                    second--
                }

                first >= 0 -> {
                    nums1[i] = nums1[first]
                    first--
                }
            }
        }
        println(nums1.joinToString())
    }
}