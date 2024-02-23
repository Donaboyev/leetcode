package top_interview150.q0149

fun main() {
    val sl = Solution()
    println(
        sl.maxPoints(
            arrayOf(
                intArrayOf(-6, -1),
                intArrayOf(3, 1),
                intArrayOf(12, 3)
            )
        )
    )
}

private class Solution {
    fun maxPoints(points: Array<IntArray>): Int {
        if (points.size < 3) {
            return points.size
        }
        var max = 0
        fun count(i: Int, j: Int): Int {
            var n = 0
            for (k in points.indices) {
                if (k == i || k == j ) {
                    n++
                    continue
                }
                if (points[k][0] == points[i][0]) {

                }
//                val a = (points[k][1] - points[i][1]) / ()
//                if ((points[0]))
            }
            return n
        }
        for (i in 0..points.size - 2) {
            for (j in i + 1..<points.size) {
                val current = count(i, j)
                if (max < current) {
                    max = current
                }
            }
        }
        return max
    }
}