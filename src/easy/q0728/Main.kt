package easy.q0728

fun main() {
    val sl = Solution()
    println(sl.selfDividingNumbers(1, 22))
    println(sl.selfDividingNumbers(47, 85))
}

private class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result= mutableListOf<Int>()
        for (i in left..right) {
            var num = i
            var isSelfDividing = true
            while (num > 0) {
                val digit = num % 10
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false
                    break
                }
                num /= 10
            }
            if (isSelfDividing) {
                result.add(i)
            }
        }
        return result
    }
}