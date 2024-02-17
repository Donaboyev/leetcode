package contest.feb172024.q100211

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sl = Solution()
    println(sl.lastNonEmptyString("aabcbbca"))
}

private class Solution {
    fun lastNonEmptyString(s: String): String {
        val frequency = IntArray(26)
        var maxValue = 0
        for (letter in s) {
            frequency[letter - 'a']++
            if (maxValue < frequency[letter - 'a']) {
                maxValue = frequency[letter - 'a']
            }
        }
        val maxLetters = ArrayList<Char>()
        for (i in frequency.indices) {
            if (frequency[i] == maxValue) {
                maxLetters.add('a' + i)
            }
        }
        val indexes = IntArray(maxLetters.size)
        for (i in maxLetters.indices) {
            indexes[i] = s.lastIndexOf(maxLetters[i])
        }
        val builder = StringBuilder()
        Arrays.sort(indexes)
        for (item in indexes) {
            builder.append(s[item])
        }
        return builder.toString()
    }

}