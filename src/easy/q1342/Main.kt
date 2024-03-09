package easy.q1342

fun main() {
    val sl = Solution()
    println(sl.numberOfSteps(14))
}


private class Solution {
    fun numberOfSteps(num: Int): Int {
        var steps = 0
        var current = num
        while (current != 0) {
            if (current and 1 == 0) {
                current = current shr 1
            } else {
                current--
            }
            steps++
        }
        return steps
    }
//    fun numberOfSteps(num: Int): Int {
//        var steps = 0
//        var current = num
//        while (current != 0) {
//            if (current % 2 == 0) {
//                current /= 2
//            } else {
//                current -= 1
//            }
//            steps++
//        }
//        return steps
//    }
}