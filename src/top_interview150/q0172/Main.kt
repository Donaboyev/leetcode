package top_interview150.q0172

fun main() {
    val sl = Solution()
    println(sl.trailingZeroes(5))
}

private class Solution {
    fun trailingZeroes(n: Int): Int {
        var i = 5
        var result = 0
        while (n / i > 0) {
            result += n / i
            i *= 5
        }
        return result
    }

//    fun trailingZeroes(n: Int): Int {
//        var current = n
//        var result = 0
//        while (current > 0) {
//            current /= 5
//            result += current
//        }
//        return result
//    }

//    fun trailingZeroes(n: Int): Int {
//        return n / 5 + n / 25 + n / 125 + n / 625 + n / 3125
//    }

//    fun trailingZeroes(n: Int): Int {
//        var result = 0
//        var delta = 5
//        while (delta <= n) {
//            var i = 1
//            while (i * delta <= n) {
//                result++
//                i++
//            }
//            delta *= 5
//        }
//        return result
//    }

//    fun trailingZeroes(n: Int): Int {
//        if (n == 0) {
//            return 0
//        }
//        var count = 0
//        for (i in 1..n) {
//            var current = i
//            while (current % 5 == 0) {
//                current /= 5
//                count++
//            }
//        }
//        return count
//    }
}