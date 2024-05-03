package daily_challenges.d03052024q0165

fun main() {
    val sl = Solution()
//    println(sl.compareVersion("1.01", "1.001"))
//    println(sl.compareVersion("1.0", "1.0.0"))
//    println(sl.compareVersion("0.1", "1.1"))
    println(sl.compareVersion("7.5.2.4", "7.5.3"))
}

private class Solution {

    fun compareVersion(version1: String, version2: String): Int {
        val one = version1.split(".").map { it.toInt() }
        val two = version2.split(".").map { it.toInt() }
        val till = if (one.size > two.size) one.size else two.size
        for (i in 0 until till) {
            val a = if (i < one.size) one[i] else 0
            val b = if (i < two.size) two[i] else 0
            if (a < b) {
                return -1
            } else if (a > b) {
                return 1
            }
        }
        return 0
    }

    /**
     * It's my first approach
     */

//    fun compareVersion(version1: String, version2: String): Int {
//        val first = version1.split(".").map { it.toInt() }.toMutableList()
//        val second = version2.split(".").map { it.toInt() }.toMutableList()
//        val maxNumberItems = maxOf(first.size, second.size)
//        while (first.size < maxNumberItems) {
//            first.add(0)
//        }
//        while (second.size < maxNumberItems) {
//            second.add(0)
//        }
//        for (i in first.indices) {
//            when {
//                first[i] > second[i] -> return 1
//                first[i] < second[i] -> return -1
//            }
//        }
//        return 0
//    }

}