package easy.q2894

fun main() {
    val sl = Solution()
    println(sl.differenceOfSums(10, 3))
}

private class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {
        var num1 = 0
        var num2 = 0
        for (i in 1..n) {
            if (i % m == 0) {
                num2 += i
            } else {
                num1 += i
            }
        }
        return num1 - num2
    }

//    fun differenceOfSums(n: Int, m: Int): Int {
//        return ((n + 1) * n - 2 * m * (n / m) * (n / m + 1)) / 2
//    }
}