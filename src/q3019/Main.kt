package q3019

fun main() {
    val sl = Solution()
    println(sl.countKeyChanges("aAbBcC"))
}

class Solution {
//    fun countKeyChanges(s: String): Int {
//        return s.lowercase().windowed(2, 1).count { it[0] != it[1] }
//    }
//    fun countKeyChanges(s: String): Int {
//        var count = 0
//        val text = s.lowercase()
//        for (i in 0..<text.length - 1) {
//            if (text[i] == text[i + 1]) {
//                continue
//            }
//            count++
//        }
//        return count
//    }
//    fun countKeyChanges(s: String): Int {
//        var count = 0
//        val letters = s.toCharArray()
//        for (i in 0..<letters.size - 1) {
//            val leftUp = letters[i] - 'A'
//            val leftLow = letters[i] - 'a'
//            val rightUp = letters[i + 1] - 'A'
//            val rightLow = letters[i + 1] - 'a'
//            if (leftUp == rightUp || leftLow == rightLow || leftUp == rightLow || leftLow == rightUp) {
//                continue
//            }
//            count++
//        }
//        return count
//    }
    fun countKeyChanges(s: String): Int {
        var count = 0
        for (i in 0..<s.length - 1) {
            val leftUp = s[i] - 'A'
            val leftLow = s[i] - 'a'
            val rightUp = s[i + 1] - 'A'
            val rightLow = s[i + 1] - 'a'
            if (leftUp == rightUp || leftLow == rightLow || leftUp == rightLow || leftLow == rightUp) {
                continue
            }
            count++
        }
        return count
    }
}