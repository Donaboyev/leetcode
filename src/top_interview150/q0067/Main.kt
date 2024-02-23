package top_interview150.q0067

import kotlin.math.max

fun main() {
    val sl = Solution()
    println(sl.addBinary("11", "1"))
}

private class Solution {

    fun addBinary(a: String, b: String): String {
        val maxLength = max(a.length, b.length)
        val aDigits = CharArray(maxLength)
        val bDigits = CharArray(maxLength)
        for (i in maxLength - 1 downTo 0) {
            aDigits[i] = if (a.length - maxLength + i >= 0) a[a.length - maxLength + i] else '0'
        }
        for (i in maxLength - 1 downTo 0) {
            bDigits[i] = if (b.length - maxLength + i >= 0) b[b.length - maxLength + i] else '0'
        }
        val result = CharArray(maxLength + 1)
        var carryOver = '0'
        for (i in maxLength downTo 0) {
            if (i == 0) {
                result[i] = if (carryOver == '0') ' ' else '1'
                break
            }
            val aCurrent = aDigits[i - 1]
            val bCurrent = bDigits[i - 1]
            when {
                aCurrent == '1' && bCurrent == '1' -> {
                    if (carryOver == '1') {
                        result[i] = '1'
                    } else {
                        result[i] = '0'
                        carryOver = '1'
                    }
                }

                (aCurrent == '0' && bCurrent == '1') || (aCurrent == '1' && bCurrent == '0') -> {
                    if (carryOver == '1') {
                        result[i] = '0'
                    } else {
                        result[i] = '1'
                    }
                }

                else -> {
                    if (carryOver == '1') {
                        result[i] = '1'
                        carryOver = '0'
                    } else {
                        result[i] = '0'
                    }
                }
            }
        }
        return String(result).trim()
    }

}