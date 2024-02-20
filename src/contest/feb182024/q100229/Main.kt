package contest.feb182024.q100229

fun main() {
    val sl = Solution()
    println(sl.longestCommonPrefix(intArrayOf(1, 10, 100), intArrayOf(1000)))
}

private class Solution {
    fun longestCommonPrefix(arr1: IntArray, arr2: IntArray): Int {
        var maxComPre = 0
        for (i in arr1.indices) {
            for (j in arr2.indices) {
                val com = commonPrefixLength(arr1[i], arr2[j])
                if (com > maxComPre) {
                    maxComPre = com
                }
            }
        }
        return maxComPre
    }

    fun commonPrefixLength(left: Int, right: Int): Int {
        var i = 0
        val leftText = left.toString()
        val rightText = right.toString()
        while (i < leftText.length && i < rightText.length) {
            if (leftText[i] == rightText[i]) {
                i++
                continue
            }
            break
        }
        return i
    }
}