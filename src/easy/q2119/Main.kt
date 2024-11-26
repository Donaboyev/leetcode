package easy.q2119

fun main() {
    val sl = Solution()
    println(sl.isSameAfterReversals(526))
    println(sl.isSameAfterReversals(1800))
    println(sl.isSameAfterReversals(0))
}


private class Solution {
    fun isSameAfterReversals(num: Int) = num == 0 || num % 10 != 0
}