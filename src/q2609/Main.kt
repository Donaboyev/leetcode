package q2609

import kotlin.math.max
import kotlin.math.min

fun main() {
    val sl = Solution()
    println(sl.findTheLongestBalancedSubstring("111"))
}

private class Solution {
    fun findTheLongestBalancedSubstring(s: String): Int {
        var max = 0
        var lastSeq = 0
        var current = s[0]
        var i = 1
        var seq = 1
        while (i < s.length) {
            val c = s[i]
            when (c) {
                current -> seq++
                '0' -> {
                    max = max(max, min(seq, lastSeq))
                    current = '0'
                    lastSeq = seq
                    seq = 1
                }
                else -> {
                    current = '1'
                    lastSeq = seq
                    seq = 1
                }
            }
            i++
        }
        if (current == '1') {
            max = max(max, min(seq, lastSeq))
        }
        return max shl 1
    }

//    fun findTheLongestBalancedSubstring(s: String): Int {
//        var zeros = 0
//        var ones = 0
//        var max = 0
//        var i = 0
//        while (i < s.length && s[i] != '0') {
//            i++
//        }
//        if (i == s.length) {
//            return 0
//        }
//        for (index in i..<s.length) {
//            if (s[index] == '0') {
//                if (ones != 0) {
//                    ones = 0
//                    zeros = 0
//                }
//                zeros++
//            } else {
//                ones++
//                if (zeros != 0) {
//                    val min = min(zeros, ones)
//                    if (max < min) {
//                        max = min
//                    }
//                }
//            }
//        }
//        return max * 2
//    }
}