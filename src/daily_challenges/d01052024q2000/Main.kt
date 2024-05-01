package daily_challenges.d01052024q2000

import java.util.Stack

fun main() {
    val sl = Solution()
    println(sl.reversePrefix("abcdefd", 'd'))
}

private class Solution {

    fun reversePrefix(word: String, ch: Char): String {
        val chIndex = word.indexOf(ch)
        if (chIndex == -1) {
            return word
        }
        val result = StringBuilder()
        for (i in word.indices) {
            if (i <= chIndex) {
                result.append(word[chIndex - i])
            } else {
                result.append(word[i])
            }
        }
        return result.toString()
    }

//    fun reversePrefix(word: String, ch: Char): String {
//        val stack = Stack<Char>()
//        val result = StringBuilder()
//        var index = 0
//        while (index < word.length) {
//            stack.push(word[index])
//            if (word[index] == ch) {
//                while (stack.isNotEmpty()) {
//                    result.append(stack.pop())
//                }
//                index++
//                while (index < word.length) {
//                    result.append(word[index])
//                    index++
//                }
//                return result.toString()
//            }
//            index++
//        }
//        return word
//    }

//    fun reversePrefix(word: String, ch: Char): String {
//        var index = 0
//        while (index < word.length && word[index] != ch) {
//            index++
//        }
//
//        if (index == word.length) {
//            return word
//        }
//
//        val letters = word.toCharArray()
//        for (i in 0..index / 2) {
//            val temp = letters[i]
//            letters[i] = letters[index - i]
//            letters[index - i] = temp
//        }
//        return String(letters)
//    }

    /**
     * It's my first approach
     */

//    fun reversePrefix(word: String, ch: Char) = when (val index = word.indexOf(ch)) {
//        -1 -> word
//        word.length - 1 -> word.reversed()
//        else -> word.substring(0, index + 1).reversed() + word.substring(index + 1)
//    }

}