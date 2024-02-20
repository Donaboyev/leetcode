package medium.q2105

fun main() {
    val sl = Solution()
    println(sl.minimumRefill(intArrayOf(2, 2, 3, 3), 5, 5))
}

private class Solution {
    fun minimumRefill(plants: IntArray, capacityA: Int, capacityB: Int): Int {
        var i = 0
        var j = plants.size - 1
        var currentA = capacityA
        var currentB = capacityB
        var count = 0
        while (i < j) {
            if (currentA < plants[i]) {
                currentA = capacityA
                count++
            }
            currentA -= plants[i]
            if (currentB < plants[j]) {
                currentB = capacityB
                count++
            }
            currentB -= plants[j]
            i++
            j--
        }
        if (i == j) {
            if (currentA < currentB) {
                if (currentB < plants[i]) {
                    count++
                }
            } else {
                if (currentA < plants[i]) {
                    count++
                }
            }
        }
        return count
    }
}