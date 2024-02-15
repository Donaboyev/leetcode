package easy.q0832

fun main() {
    val sl = Solution()
    print2DArray(
        sl.flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0)
            )
        )
    )
}

fun print2DArray(image: Array<IntArray>) {
    for (item in image) {
        println(item.joinToString())
    }
    println()
}

private class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (item in image) {
            var i = 0
            var j = item.size - 1
            while (i < j) {
                val temp = item[i]
                item[i] = item[j].reverse()
                item[j] = temp.reverse()
                i++
                j--
            }
            if (i == j) {
                item[i] = item[i].reverse()
            }
        }
        return image
    }

    fun Int.reverse() = if (this == 0) {
        1
    } else {
        0
    }
}