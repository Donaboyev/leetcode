package easy.q2706

import java.util.*

fun main() {
    val sl = Solution()
    println(sl.buyChoco(intArrayOf(1, 2, 2), 3))
    println(sl.buyChoco(intArrayOf(98, 54, 6, 34, 66, 63, 52, 39), 62))
}

private class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var firstSmallPrice = Int.MAX_VALUE
        var secondSmallPrice = Int.MAX_VALUE
        for (item in prices) {
            if (firstSmallPrice > item) {
                secondSmallPrice = firstSmallPrice
                firstSmallPrice = item
            } else if (secondSmallPrice > item) {
                secondSmallPrice = item
            }
        }
        if (firstSmallPrice + secondSmallPrice > money) {
            return money
        }
        return money - firstSmallPrice - secondSmallPrice
    }

//    fun buyChoco(prices: IntArray, money: Int): Int {
//        Arrays.sort(prices)
//        if (prices[0] + prices[1] > money) {
//            return money
//        }
//        return money - prices[0] - prices[1]
//    }
}