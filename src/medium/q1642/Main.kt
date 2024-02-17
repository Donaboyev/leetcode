package medium.q1642

import java.util.PriorityQueue

fun main() {
    val sl = Solution()
    println(sl.furthestBuilding(intArrayOf(4, 12, 2, 7, 3, 18, 20, 3, 19), 10, 2))
}

private class Solution {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
        val pq = PriorityQueue<Int>(Comparator.reverseOrder())
        var currentBricks = bricks
        var currentLadders = ladders
        for (i in 0 until heights.lastIndex) {
            val jump = heights[i + 1] - heights[i]
            if (jump <= 0) {
                continue
            }
            currentBricks -= jump
            pq.add(jump)
            if (currentBricks < 0) {
                currentBricks += pq.poll()
                if (currentLadders > 0) {
                    currentLadders--
                } else {
                    return i
                }
            }
        }
        return heights.lastIndex
    }

//    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
//        val pq = PriorityQueue<Int>()
//        var remainingBricks = bricks
//        val leftOver = heights.asSequence()
//            .zipWithNext()
//            .dropWhile { (firstHeight, secondHeight) ->
//                if (firstHeight < secondHeight) {
//                    pq.add(secondHeight - firstHeight)
//                    if (pq.size > ladders) {
//                        remainingBricks -= pq.remove()
//                    }
//                }
//                remainingBricks >= 0
//            }.toList()
//        return heights.lastIndex - leftOver.size
//    }

}