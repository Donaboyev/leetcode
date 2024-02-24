package easy.q2806

import kotlin.math.log10
import kotlin.math.pow

fun main() {
    val sl = Solution()
    println(sl.accountBalanceAfterPurchase(16))
}

private class Solution {
    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        val remainder = purchaseAmount % 10
        if (remainder % 10 < 5) {
            return 100 - purchaseAmount + remainder
        }
        return 100 - purchaseAmount - 10 + remainder
    }
}