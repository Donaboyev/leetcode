package easy.q2469

fun main() {
    val sl = Solution()
    println(sl.convertTemperature(36.50).toList())
}


private class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf(celsius + 273.15, celsius * 9 / 5 + 32.0)
    }
}