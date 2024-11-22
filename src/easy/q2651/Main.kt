package easy.q2651

fun main() {
    val sl = Solution()
    println(sl.findDelayedArrivalTime(15, 5))
    println(sl.findDelayedArrivalTime(13, 11))
}

private class Solution {
    fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int) = (arrivalTime + delayedTime) % 24
}