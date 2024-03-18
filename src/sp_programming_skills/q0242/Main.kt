package sp_programming_skills.q0242


fun main() {
    val sl = Solution()
    println(sl.isAnagram("anagram", "nagaram"))
}

private class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val letters = IntArray(256)
        for (i in s.indices) {
            letters[s[i].code]++
        }
        for (i in t.indices) {
            letters[t[i].code]--
        }
        for (i in letters.indices) {
            if (letters[i] != 0) {
                return false
            }
        }
        return true
    }
//    fun isAnagram(s: String, t: String): Boolean {
//        if (s.length != t.length) {
//            return false
//        }
//        val sLetters = s.toCharArray()
//        val tLetters = t.toCharArray()
//        Arrays.sort(sLetters)
//        Arrays.sort(tLetters)
//        return String(sLetters) == String(tLetters)
//    }
//    fun isAnagram(s: String, t: String): Boolean {
//        if (s.length != t.length) {
//            return false
//        }
//        val sLetters = HashMap<Char, Int>()
//        val tLetters = HashMap<Char, Int>()
//        for (i in s.indices) {
//            sLetters[s[i]] = sLetters.getOrDefault(s[i], 0) + 1
//        }
//        for (i in t.indices) {
//            tLetters[t[i]] = tLetters.getOrDefault(t[i], 0) + 1
//        }
//        for (i in sLetters.keys) {
//            if (sLetters[i] != tLetters[i]) {
//                return false
//            }
//        }
//        return true
//    }
}