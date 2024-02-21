package top_interview150.q0058

fun main() {
    val sl = Solution()
    println(sl.lengthOfLastWord("Hello World"))
}

private class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        for(i in s.length-1 downTo 0) {
            if(count == 0 && s[i] == ' ') {
                continue
            }
            if(s[i] != ' ') {
                count++
                continue
            }
            return count
        }
        return count
    }
}