package easy.q2525

fun main() {
    val sl = Solution()
    println(sl.categorizeBox(length = 1000, width = 35, height = 700, mass = 300))
    println(sl.categorizeBox(length = 200, width = 50, height = 800, mass = 50))
    println(sl.categorizeBox(length = 2909, width = 3968, height = 3272, mass = 727))
    println(sl.categorizeBox(length = 1000, width = 1000, height = 1000, mass = 1000))
    println(sl.categorizeBox(length = 2593, width = 6432, height = 46, mass = 412))
}

private class Solution {
    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
        val isBulky = when {
            maxOf(length, width, height) >= 1e4 -> true
            1e9 / length / height / width <= 1 -> true
            else -> false
        }
        val isHeavy = mass >= 100
        return when {
            isBulky && isHeavy -> "Both"
            isBulky -> "Bulky"
            isHeavy -> "Heavy"
            else -> "Neither"
        }
    }
//    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
//        val isBulky = when {
//            length >= 10_000 || width >= 10_000 || height >= 10_000 -> true
//            1_000_000_000 / length.toDouble() / height / width <= 1 -> true
//            else -> false
//        }
//        val isHeavy = mass >= 100
//        return when {
//            isBulky && isHeavy -> "Both"
//            isBulky -> "Bulky"
//            isHeavy -> "Heavy"
//            else -> "Neither"
//        }
//    }
}