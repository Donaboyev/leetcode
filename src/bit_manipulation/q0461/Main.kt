package bit_manipulation.q0461

fun main() {
    val solution = Solution()
    println(solution.hammingDistance(1, 4))
    println(solution.hammingDistance(3, 1))
}

class Solution {
//    fun hammingDistance(x: Int, y: Int): Int {
//        return Integer.bitCount(x xor y)
//    }

    fun hammingDistance(x: Int, y: Int): Int {
        return (x xor y).countOneBits()
    }
}