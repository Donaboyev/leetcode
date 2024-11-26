package easy.q2544

fun main() {
    val sl = Solution()
    println(sl.alternateDigitSum(521))
    println(sl.alternateDigitSum(111))
    println(sl.alternateDigitSum(886996))
    println(sl.alternateDigitSum(25))
}

private class Solution {
    fun alternateDigitSum(n: Int): Int {
        var sum = 0
        var evenSum = 0
        var number = n
        var index = 0
        while (number > 0) {
            index++
            val digit = number % 10
            sum += digit
            if (index % 2 == 0) {
                evenSum += digit
            }
            number = number / 10
        }
        return if (index % 2 == 0) 2 * evenSum - sum else sum - 2 * evenSum
    }
}