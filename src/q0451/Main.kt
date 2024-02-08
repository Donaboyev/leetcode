package q0451

fun main() {
    val sl = Solution()
    println(sl.frequencySort("dddsshhbbaa"))
}

class Solution {
    fun frequencySort(s: String): String {
        val letters: CharArray = s.toCharArray()
        println(letters.joinToString())
        val frequencyMap = HashMap<Char, Int>()

        for (item in letters) {
            val map = frequencyMap[item]
            frequencyMap[item] = (map ?: 0) + 1
        }
        val values = frequencyMap.values.sortedDescending()
        println(values)
        val builder = StringBuilder()
        for (value in values) {

        }
        return s
    }
}