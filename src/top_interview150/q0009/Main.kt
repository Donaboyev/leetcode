package top_interview150.q0009

fun main() {
    val sl = Solution()
    println(sl.isPalindrome(0))
}

private class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || x > 0 && x % 10 == 0) {
            return false
        }
        var reversed = 0
        var original = x
        while (original > reversed) {
            reversed = reversed * 10 + original % 10
            original /= 10
        }
        return original == reversed || original == reversed / 10
    }

//    fun isPalindrome(x: Int): Boolean {
//        if (x < 0 || x > 0 && x % 10 == 0) {
//            return false
//        }
//        val number = x.toString()
//        var i = 0
//        var j = number.length - 1
//        while (i <= j) {
//            if (number[i] != number[j]) {
//                return false
//            }
//            i++
//            j--
//        }
//        return true
//    }
}