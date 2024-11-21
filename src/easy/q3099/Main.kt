package easy.q3099

fun main() {
    val sl = Solution()
    println(sl.sumOfTheDigitsOfHarshadNumber(18))
    println(sl.sumOfTheDigitsOfHarshadNumber(23))
}

private class Solution {
    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        var number = x
        var sum = 0
        while (number > 0) {
            sum += number % 10
            number /= 10
        }
        if (x % sum == 0) {
            return sum
        }
        return -1
    }
}