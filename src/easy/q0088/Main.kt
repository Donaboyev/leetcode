package easy.q0088

fun main() {
    val sl = Solution()
    println(
        sl.merge(
            intArrayOf(0, 0, 0, 0, 0),
            0,
            intArrayOf(1, 2, 3, 4, 5),
            5
        )
    )
}

private class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var firstIndex = m - 1
        var secondIndex = n - 1
        for (i in nums1.size - 1 downTo 0) {
            if (firstIndex >= 0 && (secondIndex < 0 || nums1[firstIndex] > nums2[secondIndex])) {
                nums1[i] = nums1[firstIndex]
                firstIndex--
            } else {
                nums1[i] = nums2[secondIndex]
                secondIndex--
            }
        }
        println(nums1.joinToString())
    }
//    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
//        var i = nums1.size - 1
//        var firstIndex = m - 1
//        var secondIndex = n - 1
//        while (i >= 0) {
//            if (firstIndex >= 0) {
//                if (secondIndex >= 0) {
//                    if (nums1[firstIndex] > nums2[secondIndex]) {
//                        nums1[i] = nums1[firstIndex]
//                        firstIndex--
//                    } else {
//                        nums1[i] = nums2[secondIndex]
//                        secondIndex--
//                    }
//                } else {
//                    nums1[i] = nums1[firstIndex]
//                    firstIndex--
//                }
//            } else {
//                nums1[i] = nums2[secondIndex]
//                secondIndex--
//            }
//            i--
//        }
//    }
}