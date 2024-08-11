package bit_manipulation.q0476

import kotlin.random.Random

fun main() {
    val solution = Solution()
//    println(solution.findComplement(5))
//    println(solution.getRandom(setOf("009008", "123654")))
    println("Abbos o'g'li".checkName())
}

class Solution {
    fun findComplement(num: Int): Int {
        val binary = num.toString(2)
        val builder = StringBuilder()
        for (digit in binary) {
            if (digit == '0') {
                builder.append('1')
            } else {
                builder.append('0')
            }
        }
        return builder.toString().toInt(2)
    }

    fun getRandom(exclude: Set<String>): String {
        while (true) {
            val rand = Random.nextInt(0, 1000000)
            val text = String.format("%06d", rand)
            if (text !in exclude) {
                return text
            }
        }
    }
}

fun String.checkName() = when {
    this.trim().length !in 3..30 -> null
    this.any { !(it.isLetter() || it.isWhitespace() || it == '\'' || it == '`') } -> null
    else -> this.trim()
}