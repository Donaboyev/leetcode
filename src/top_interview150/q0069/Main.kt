package top_interview150.q0069

fun main() {
    val sl = Solution()
    println(sl.mySqrt(24))
}

private class Solution {
    fun mySqrt(x: Int): Int {
        var left = 1
        var right = x
        while (left <= right) {
            val middle = (left + right) / 2
            if (middle == x / middle) {
                return middle
            }
            if (middle > x / middle) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return right
    }

//    fun mySqrt(x: Int): Int {
//        var count = 0
//        var current = x
//        var odd = 1
//        while (current > 0) {
//            current -= odd
//            odd += 2
//            count++
//        }
//        return if (current == 0) count else count - 1
//    }
}