package contest.feb182024.q100212

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sl = Solution()
    println(sl.countPrefixSuffixPairs(arrayOf("pa", "papa", "ma", "mama")))
}

private class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        if (words.size < 2) {
            return 0
        }
        var count = 0
        for (i in 0 until words.size - 1) {
            for (j in i + 1 until words.size) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++
                }
            }
        }
        return count
    }

    fun isPrefixAndSuffix(str1: String, str2: String): Boolean {
        if (str2.length < str1.length) {
            return false
        }
        return str2.substring(0, str1.length) == str1
                && str2.substring(str2.length - str1.length , str2.length) == str1
    }
}