package easy.q1232

fun main() {
    val sl = Solution()
    println(
        sl.checkStraightLine(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(5, 6),
                intArrayOf(6, 7),
            )
        )
    )
}


private class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        val firstX = coordinates[0][0]
        val secondX = coordinates[1][0]
        if (firstX == secondX) {
            for (i in 2 until coordinates.size) {
                if (coordinates[i][0] != firstX) {
                    return false
                }
            }
            return true
        }
        val firstY = coordinates[0][1]
        val secondY = coordinates[1][1]
        if (firstY == secondY) {
            for (i in 2 until coordinates.size) {
                if (coordinates[i][1] != firstY) {
                    return false
                }
            }
            return true
        }
        for (i in 2 until coordinates.size) {
            if ((coordinates[i][1] - firstY) * (secondX - firstX) != (coordinates[i][0] - firstX) * (secondY - firstY)) {
                return false
            }
        }
        return true
    }
//    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
//        val firstX = coordinates[0][0]
//        val secondX = coordinates[1][0]
//        if (firstX == secondX) {
//            for (i in 2 until coordinates.size) {
//                if (coordinates[i][0] != firstX) {
//                    return false
//                }
//            }
//            return true
//        }
//        val firstY = coordinates[0][1]
//        val secondY = coordinates[1][1]
//        if (firstY == secondY) {
//            for (i in 2 until coordinates.size) {
//                if (coordinates[i][1] != firstY) {
//                    return false
//                }
//            }
//            return true
//        }
//        for (i in 2 until coordinates.size) {
//            if ((firstY - secondY) * coordinates[i][0] + firstX * secondY - secondX * firstY != (firstX - secondX) * coordinates[i][1]) {
//                return false
//            }
//        }
//        return true
//    }
}