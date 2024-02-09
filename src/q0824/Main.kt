package q0824

fun main() {
    val sl = Solution()
    println(sl.toGoatLatin("Each word consists of lowercase and uppercase letters only"))
}

private class Solution {
    fun toGoatLatin(sentence: String): String {
        val builder = StringBuilder()
        val words = sentence.split(" ")
        for (i in words.indices) {
            if (words[i][0].isVowel()) {
                builder.append(words[i], "ma")
            } else {
                builder.append(words[i].substring(1), words[i][0], "ma")
            }
            builder.append("a".repeat(i + 1), " ")
        }
        return builder.toString().trim()
    }

    fun Char.isVowel(): Boolean {
        return when (this) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
            else -> false
        }
    }
//    fun toGoatLatin(sentence: String): String {
//        val builder = StringBuilder()
//        val words = sentence.split(" ")
//        for (i in words.indices) {
//            if (checkVowel(words[i][0])) {
//                builder.append(words[i], "ma", "a".repeat(i + 1), " ")
//            } else {
//                builder.append(words[i].substring(1), words[i][0], "ma", "a".repeat(i + 1), " ")
//            }
//        }
//        return builder.toString().trim()
//    }
//
//    private fun checkVowel(letter: Char): Boolean {
//        return when (letter) {
//            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
//            else -> false
//        }
//    }
}