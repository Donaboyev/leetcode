package top_interview150.q0050

import kotlin.math.abs
import kotlin.math.pow

fun main() {
    val sl = Solution()
    println(sl.myPow(0.00001, 2147483647))
}

/**
 * 6^7 = 6 * 6 * 6 * 6 * 6 * 6 * 6
 *
 * 1. 7 % 2 = 1
 * 6^7 = 6 * 6^6
 *
 * 2. 6 % 2 = 0
 * 6^6 = (6 * 6)^3 = 36^3
 *
 * 3. 3 % 2 = 1
 * 36^3 = 36 * 36^2
 *
 * 4. 2 % 2 = 0
 * 36^2 = (36 * 36)^1 = 1296^1
 *
 * 5. 1 % 2 = 1
 * 1296^1 = 1296 * 1296^0
 *
 * 7. 0 = 0 -> 1
 */

private class Solution {
    fun myPow(x: Double, n: Int): Double {
        fun inlinePow(x: Double, n: Long): Double {
            if (n == 0L) return 1.0
            if (n < 0) return 1.0 / (inlinePow(x, -1 * n))
            if (n % 2 == 0L) {
                return inlinePow(x * x, n / 2)
            }
            return x * inlinePow(x * x, (n - 1) / 2)
        }
        return inlinePow(x, n.toLong())
    }

//    fun myPow(x: Double, n: Int): Double {
//        val transformBased = if (n < 0) 1 / x else x
//        fun powRecursion(base: Double, exp: Int): Double {
//            return when (exp) {
//                0 -> 1.0
//                1 -> base
//                3 -> base * base * base
//                else -> {
//                    val ret = powRecursion(base, exp / 2)
//                    if (exp % 2 == 0) {
//                        ret * ret
//                    } else {
//                        base * ret * ret
//                    }
//                }
//            }
//        }
//        return powRecursion(transformBased, abs(n))
//    }

//    fun myPow(x: Double, n: Int): Double {
//        return x.pow(n.toDouble())
//    }
}