package top_interview150.q0066

fun main() {
    val sl = Solution()
    println(sl.plusOne(intArrayOf(9, 8, 9)).joinToString())
}

private class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
//    fun plusOne(digits: IntArray): IntArray {
//        var isNiner = true
//        for (i in digits.indices) {
//            if (digits[i] != 9) {
//                isNiner = false
//                break
//            }
//        }
//        if (isNiner) {
//            val result = IntArray(digits.size + 1)
//            result[0] = 1
//            for (i in 1..<result.size) {
//                result[i] = 0
//            }
//            return result
//        }
//        if (digits[digits.size - 1] == 9) {
//            var ten = 0
//            for (i in digits.size - 1 downTo 0) {
//                val current = digits[i] + ten + (if (i == digits.size - 1) 1 else 0)
//                println(current)
//                digits[i] = current % 10
//                ten = current / 10
//            }
//            return digits
//        }
//        digits[digits.size - 1] += 1
//        return digits
//    }
}