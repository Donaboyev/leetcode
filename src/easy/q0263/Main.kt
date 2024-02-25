package easy.q0263

import kotlin.math.max
import kotlin.math.sqrt

fun main() {
    val sl = Solution()
    println(sl.isUgly(11))
}

private class Solution {
    fun isUgly(n: Int): Boolean {
        if (n < 1) {
            return false
        }
        if (n == 1) {
            return true
        }
        var current = n
        var isPrime = true
        while (current % 2 == 0) {
            current /= 2
            isPrime = false
        }
        while (current % 3 == 0) {
            current /= 3
            isPrime = false
        }
        while (current % 5 == 0) {
            current /= 5
            isPrime = false
        }
        if (current > 6) {
            val max = max(49, current)
            for (i in 7..sqrt(max.toDouble()).toInt()) {
                if (current % i == 0) {
                    return false
                }
                current /= i
            }
        }
        return !isPrime
    }
}