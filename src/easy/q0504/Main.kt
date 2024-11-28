package easy.q0504

fun main() {
    val sl = Solution()
    println(sl.convertToBase7(100))
    println(sl.convertToBase7(-7))
    println(sl.convertToBase7(0))
}

private class Solution {
    fun convertToBase7(num: Int): String {
        if (num == 0) {
            return "0"
        }
        val sb = StringBuilder()
        var n = num
        if (n < 0) {
            n = -n
        }
        while (n > 0) {
            sb.append(n % 7)
            n /= 7
        }
        if (num < 0) {
            sb.append("-")
        }
        return sb.reverse().toString()
    }
}