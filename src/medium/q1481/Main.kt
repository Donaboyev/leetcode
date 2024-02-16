package medium.q1481

import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val sl = Solution()
    println(sl.findLeastNumOfUniqueInts(intArrayOf(4, 3, 1, 1, 3, 3, 2), 3))
}

private class Solution {
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        arr.forEach {
            map[it] = (map[it] ?: 0) + 1
        }
        val queue = PriorityQueue<Int>()
        map.values.forEach {
            queue.offer(it)
        }
        var remaining = k
        while (queue.isNotEmpty() && remaining >= queue.peek()) {
            remaining -= queue.poll()
        }
        return queue.size
    }

//    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
//        var k = k
//        val counts = HashMap<Int, Int>()
//        for (num in arr) {
//            counts[num] = counts.getOrDefault(num, 0) + 1
//        }
//        val ordered = ArrayList<Int>()
//        for (value in counts.values) {
//            ordered.add(value)
//        }
//        Collections.sort(ordered, Comparator.reverseOrder())
//        while (k > 0) {
//            val value = ordered[ordered.size - 1]
//            if (value <= k) {
//                k -= value
//                ordered.removeAt(ordered.size - 1)
//            } else {
//                break
//            }
//        }
//        return ordered.size
//    }

//    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
//        val frequency = HashMap<Int, Int>()
//        for (item in arr) {
//            if (frequency[item] == null) {
//                frequency[item] = 1
//            } else {
//                frequency[item] = frequency[item]!! + 1
//            }
//        }
//        val sorted = frequency.toList().sortedBy { (_, value) -> value }.toMap().toMutableMap()
//        var count = k
//        while (count > 0) {
//            val current = sorted.keys.first()
//            if (count - sorted[current]!! >= 0) {
//                count -= sorted[current]!!
//                sorted.remove(current)
//            } else {
//                break
//            }
//        }
//        return sorted.size
//    }
}