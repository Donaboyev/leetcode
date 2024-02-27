package easy.q1030

fun main() {
    val sl = Solution()
    print2DArray(sl.allCellsDistOrder(2, 2, 0, 1))
}

fun print2DArray(array: Array<IntArray>) {
    for (item in array) {
        println(item.joinToString())
    }
}

private class Solution {
    fun allCellsDistOrder(rows: Int, cols: Int, rCenter: Int, cCenter: Int): Array<IntArray> {
        val array = Array(rows * cols) {
            IntArray(2)
        }
        var centerIndex = 0
        var i = 0
        while (i < array.size) {
            for (c in 0 until cols) {
                for (r in 0 until rows) {
                    if (r == rCenter && c == cCenter) {
                        centerIndex = i
                    }
                    array[i] = intArrayOf(r, c)
                    i++
                }
            }
        }
        val result = Array(array.size) {
            IntArray(2)
        }
        var left = centerIndex - 1
        var right = centerIndex + 1
        result[0] = array[centerIndex]
        var current = 1
        while (current < result.size) {
            if (left >= 0) {
                result[current] = array[left]
                current++
                left--
            }
            if (right < result.size) {
                result[current] = array[right]
                right++
                current++
            }
        }
        return result
    }
}