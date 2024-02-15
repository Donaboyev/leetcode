package medium.q2971

import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val sl = Solution()
    println(sl.largestPerimeter(intArrayOf(1, 12, 1, 2, 5, 50, 3)))
}

private class Solution {

    fun largestPerimeter(nums: IntArray): Long {
        var sum: Long = 0
        val pq = PriorityQueue(Collections.reverseOrder<Long>())
        for (i in nums) {
            pq.add(i.toLong())
            sum += i
        }
        while (pq.size > 2) {
            val current = pq.poll()
            if (sum - current > current) {
                return sum
            } else {
                sum -= current
            }
        }
        return -1
    }

//    fun largestPerimeter(nums: IntArray): Long {
//        nums.sort()
//        var prefix: Long = (nums[0] + nums[1]).toLong()
//        var perimeter: Long = -1
//        for (i in 2..<nums.size) {
//            if (prefix > nums[i]) {
//                perimeter = prefix + nums[i]
//            }
//            prefix += nums[i]
//        }
//        return perimeter
//    }

//    fun largestPerimeter(nums: IntArray): Long {
//        mergeSort(nums)
//        for (i in nums.size - 1 downTo 2) {
//            var sum: Long = 0
//            for (j in i - 1 downTo 0) {
//                sum += nums[j]
//            }
//            if (nums[i] < sum) {
//                return sum + nums[i]
//            }
//        }
//        return -1
//    }

//    private fun mergeSort(array: IntArray) {
//        val length = array.size
//        if (length < 2) {
//            return
//        }
//
//        val middle = length / 2
//        val leftArray = IntArray(middle)
//        val rightArray = IntArray(length - middle)
//
//        var j = 0
//        for (i in array.indices) {
//            if (i < middle) {
//                leftArray[i] = array[i]
//            } else {
//                rightArray[j] = array[i]
//                j++
//            }
//        }
//
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
//
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
//            l++
//            i++
//        }
//        while (r < rightSize) {
//            array[i] = rightArray[r]
//            r++
//            i++
//        }
//    }

}