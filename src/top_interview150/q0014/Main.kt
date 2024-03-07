package top_interview150.q0014

import kotlin.math.min

fun main() {
    val sl = Solution()
    println(sl.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(sl.longestCommonPrefix(arrayOf("", "")))
    println(sl.longestCommonPrefix(arrayOf("ab", "a")))
}

private class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size < 2) {
            return strs[0]
        }
        var maxIndex = Int.MAX_VALUE
        for (i in 1 until strs.size) {
            val minLength = min(strs[i - 1].length, strs[i].length)
            if (minLength == 0) {
                return ""
            }
            var currentMax = Int.MAX_VALUE
            for (j in 0 until minLength) {
                currentMax = j
                if (strs[i - 1][j] != strs[i][j]) {
                    break
                }
            }
            if (currentMax < maxIndex) {
                maxIndex = currentMax
            }
        }
        return strs[0].substring(0, maxIndex)
    }
}