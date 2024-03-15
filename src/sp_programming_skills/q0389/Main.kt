package sp_programming_skills.q0389

fun main() {
    val sl = Solution()
    println(sl.findTheDifference("abcd", "abcde"))
}

private class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var sum = 0
        for (i in t.indices) {
            sum += t[i].code
        }
        for (i in s.indices) {
            sum -= s[i].code
        }
        return sum.toChar()
    }
//    fun findTheDifference(s: String, t: String): Char {
//        if (s.isEmpty()) {
//            return t[0]
//        }
//        val letters = IntArray(26)
//        for (i in s.indices) {
//            letters[s[i] - 'a']++
//        }
//        for (i in t.indices) {
//            letters[t[i] - 'a']--
//            if (letters[t[i] - 'a'] < 0) {
//                return t[i]
//            }
//        }
//        return ' '
//    }
//    fun findTheDifference(s: String, t: String): Char {
//        val sLetters = HashMap<Char, Int>()
//        val tLetters = HashMap<Char, Int>()
//        for (i in s.indices) {
//            sLetters[s[i]] = sLetters.getOrDefault(s[i], 0) + 1
//        }
//        for (i in t.indices) {
//            tLetters[t[i]] = tLetters.getOrDefault(t[i], 0) + 1
//        }
//        for (l in tLetters.keys) {
//            if (sLetters[l] != tLetters[l]) {
//                return l
//            }
//        }
//        return 'a'
//    }
}