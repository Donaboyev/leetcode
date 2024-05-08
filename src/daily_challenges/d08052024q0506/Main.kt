package daily_challenges.d08052024q0506

fun main() {
    val sl = Solution()
    println(sl.findRelativeRanks(intArrayOf(5, 4, 3, 2, 1)).joinToString())
    println(sl.findRelativeRanks(intArrayOf(10, 3, 8, 9, 4)).joinToString())
}

private class Solution {

    fun findRelativeRanks(score: IntArray): Array<String> {
        val len = score.size
        val scoreCopy = IntArray(len)
        System.arraycopy(score, 0, scoreCopy, 0, len)
        val scoreToIndex = HashMap<Int, Int>()
        for (i in 0 until len) {
            scoreToIndex[scoreCopy[i]] = i
        }
        scoreCopy.sort()
        val rank = Array(len) { "" }
        for (i in 0 until len) {
            when (i) {
                0 -> {
                    rank[scoreToIndex[scoreCopy[len - 1]] ?: 0] = "Gold Medal"
                }

                1 -> {
                    rank[scoreToIndex[scoreCopy[len - i - 1]] ?: 0] = "Silver Medal"
                }

                2 -> {
                    rank[scoreToIndex[scoreCopy[len - i - 1]] ?: 0] = "Bronze Medal"
                }

                else -> {
                    rank[scoreToIndex[scoreCopy[len - i - 1]] ?: 0] = "${i + 1}"
                }
            }
        }
        return rank
    }

    /**
     * It's my first approach
     */

//    fun findRelativeRanks(score: IntArray): Array<String> {
//        val queue = PriorityQueue<Int>(Comparator.reverseOrder())
//        val result = Array(score.size) { "" }
//        val map = HashMap<Int, Int>()
//        for (i in score.indices) {
//            map[score[i]] = i
//            queue.add(score[i])
//        }
//        var count = 0
//        while (queue.isNotEmpty()) {
//            val currentValue = queue.poll()
//
//            val text = when (count++) {
//                0 -> "Gold Medal"
//                1 -> "Silver Medal"
//                2 -> "Bronze Medal"
//                else -> count.toString()
//            }
//
//            result[map[currentValue] ?: 0] = text
//        }
//        return result
//    }

}