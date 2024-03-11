package easy.q0383

fun main() {
    val sl = Solution()
    println(sl.canConstruct("a", "b"))
}

private class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineLetters = HashMap<Char, Int>()
        for (i in magazine.indices) {
            magazineLetters[magazine[i]] = magazineLetters.getOrDefault(magazine[i], 0) + 1
        }
        for (i in ransomNote.indices) {
            val current = magazineLetters.getOrDefault(ransomNote[i], 0)
            if (current <= 0) {
                return false
            }
            magazineLetters[ransomNote[i]] = current - 1
        }
        return true
    }
//    fun canConstruct(ransomNote: String, magazine: String): Boolean {
//        val frequencyRansom = HashMap<Char, Int>()
//        val frequencyMagazine = HashMap<Char, Int>()
//        for (item in ransomNote) {
//            frequencyRansom[item] = frequencyRansom.getOrDefault(item, 0) + 1
//        }
//        for (item in magazine) {
//            frequencyMagazine[item] = frequencyMagazine.getOrDefault(item, 0) + 1
//        }
//        for (i in frequencyRansom.keys) {
//            val currentRansom = frequencyRansom.getOrDefault(i, 0)
//            val currentMagazine = frequencyMagazine.getOrDefault(i, 0)
//            if (currentRansom > currentMagazine) {
//                return false
//            }
//        }
//        return true
//    }
//    fun canConstruct(ransomNote: String, magazine: String): Boolean {
//        val frequencyRansom = IntArray(26)
//        val frequencyMagazine = IntArray(26)
//        for (item in ransomNote) {
//            frequencyRansom[item - 'a']++
//        }
//        for (item in magazine) {
//            frequencyMagazine[item - 'a']++
//        }
//        for (i in frequencyRansom.indices) {
//            if (frequencyRansom[i] > frequencyMagazine[i]) {
//                return false
//            }
//        }
//        return true
//    }
}