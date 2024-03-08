package easy.q1672

fun main() {
    val sl = Solution()
    println(
        sl.maximumWealth(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(3, 2, 1)
            )
        )
    )
}


private class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = Int.MIN_VALUE
        for (i in accounts.indices) {
            var currentWealth = 0
            for (j in accounts[i].indices) {
                currentWealth += accounts[i][j]
            }
            if (maxWealth < currentWealth) {
                maxWealth = currentWealth
            }
        }
        return maxWealth
    }
}