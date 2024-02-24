package easy.q2769

fun main() {
    val sl = Solution()
    println(sl.theMaximumAchievableX(4, 1))
}

private class Solution {
    fun theMaximumAchievableX(num: Int, t: Int): Int {
        return num + 2 * t
    }
}