package medium.q2109

fun main() {
    val sl = Solution()
    println(sl.addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8, 13, 15)))
}

private class Solution {
    fun addSpaces(s: String, spaces: IntArray): String {
        val builder = StringBuilder(s.length + spaces.size)
        builder.append(s.substring(0, spaces[0]))
        for (i in 0 until spaces.size - 1) {
            builder.append(' ')
                .append(s.substring(spaces[i], spaces[i + 1]))
        }
        builder.append(' ').append(s.substring(spaces[spaces.size-1]))
        return builder.toString()
    }
//    fun addSpaces(s: String, spaces: IntArray): String {
//        val builder = StringBuilder(s.length + spaces.size)
//        var j = 0
//        for (i in s.indices) {
//            if (j < spaces.size && i == spaces[j]) {
//                builder.append(' ')
//                j++
//            }
//            builder.append(s[i])
//        }
//        return builder.toString()
//    }
}