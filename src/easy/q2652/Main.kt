package easy.q2652

import kotlin.math.log10
import kotlin.math.pow

fun main() {
    val sl = Solution()
    println(sl.sumOfMultiples(7))
}

private class Solution {
    fun sumOfMultiples(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i
            }
        }
        return sum
    }
}