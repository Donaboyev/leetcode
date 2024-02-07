package q2974

fun main() {
    val sl = Solution()
    println(sl.numberGame(intArrayOf(5, 4, 2, 3)).joinToString())
}

class Solution {
    fun numberGame(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        nums.sort()
        for (i in nums.indices step 2) {
            arr[i] = nums[i + 1]
            arr[i + 1] = nums[i]
        }
        return arr
    }

//    fun numberGame(nums: IntArray): IntArray {
//        val arr = IntArray(nums.size)
//        mergeSort(nums)
//        var i = 0
//        while (i < nums.size) {
//            arr[i] = nums[i + 1]
//            arr[i + 1] = nums[i]
//            i += 2
//        }
//        return arr
//    }

//    private fun mergeSort(array: IntArray) {
//        val length = array.size
//        if (length < 2) {
//            return
//        }
//        val middleIndex = length / 2
//        val leftArray = IntArray(middleIndex)
//        val rightArray = IntArray(length - middleIndex)
//        var i = 0
//        var j = 0
//        while (i < length) {
//            if (i < middleIndex) {
//                leftArray[i] = array[i]
//            } else {
//                rightArray[j] = array[i]
//                j++
//            }
//            i++
//        }
//        mergeSort(leftArray)
//        mergeSort(rightArray)
//        merge(leftArray, rightArray, array)
//    }

//    private fun merge(leftArray: IntArray, rightArray: IntArray, array: IntArray) {
//        val leftSize = array.size / 2
//        val rightSize = array.size - leftSize
//        var i = 0
//        var l = 0
//        var r = 0
//        while (l < leftSize && r < rightSize) {
//            if (leftArray[l] < rightArray[r]) {
//                array[i] = leftArray[l]
//                i++
//                l++
//            } else {
//                array[i] = rightArray[r]
//                i++
//                r++
//            }
//        }
//
//        while (l < leftSize) {
//            array[i] = leftArray[l]
//            i++
//            l++
//        }
//        while (r < rightSize) {
//            array[i] = rightArray[r]
//            i++
//            r++
//        }
//    }
}