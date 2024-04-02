package sp_programming_skills.q1768

import kotlin.math.max

fun main() {
    val sl = Solution()
    println(sl.mergeAlternately("abc", "pqr"))
}

private class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val merged = StringBuilder()
        for (i in 0 until max(word1.length, word2.length)) {
            if (i < word1.length) {
                merged.append(word1[i])
            }
            if (i < word2.length) {
                merged.append(word2[i])
            }
        }
        return merged.toString()
    }
//    fun mergeAlternately(word1: String, word2: String): String {
//        val merged = StringBuilder()
//        var i = 0
//        var j = 0
//        while (i < word1.length || j < word2.length) {
//            if (i < word1.length) {
//                merged.append(word1[i])
//                i++
//            }
//            if (j < word2.length) {
//                merged.append(word2[j])
//                j++
//            }
//        }
//        return merged.toString()
//    }
}