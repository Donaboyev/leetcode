package easy.q3000

fun main() {
    val sl = Solution()
    println(
        sl.areaOfMaxDiagonal(
            arrayOf(
                intArrayOf(3, 4),
                intArrayOf(4, 3)
            )
        )
    )
}

private class Solution {
    fun areaOfMaxDiagonal(dimensions: Array<IntArray>): Int {
        var maxArea = 0
        var maxDiagonalSquare = 0
        for (i in dimensions.indices) {
            val width = dimensions[i][0]
            val height = dimensions[i][1]
            val currentDiagonalSquare = width * width + height * height
            val currentArea = width * height
            if (currentDiagonalSquare > maxDiagonalSquare) {
                maxDiagonalSquare = currentDiagonalSquare
                maxArea = currentArea
            } else if (maxDiagonalSquare == currentDiagonalSquare) {
                if (maxArea < currentArea) {
                    maxArea = currentArea
                }
            }
        }
        return maxArea
    }

//    fun areaOfMaxDiagonal(dimensions: Array<IntArray>): Int {
//        var maxIndex = 0
//        for (i in 1 until dimensions.size) {
//            val firstDiagonal =
//                dimensions[maxIndex][0] * dimensions[maxIndex][0] + dimensions[maxIndex][1] * dimensions[maxIndex][1]
//            val secondDiagonal = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]
//            if (firstDiagonal < secondDiagonal) {
//                maxIndex = i
//            } else if (firstDiagonal == secondDiagonal) {
//                if (dimensions[maxIndex][0] * dimensions[maxIndex][1] < dimensions[i][0] * dimensions[i][1]) {
//                    maxIndex = i
//                }
//            }
//        }
//        return dimensions[maxIndex][0] * dimensions[maxIndex][1]
//    }
}