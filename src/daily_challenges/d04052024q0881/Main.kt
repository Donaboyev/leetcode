package daily_challenges.d04052024q0881

fun main() {
    val sl = Solution()
    println(sl.numRescueBoats(intArrayOf(1, 2), 3))
    println(sl.numRescueBoats(intArrayOf(3, 2, 2, 1), 3))
    println(sl.numRescueBoats(intArrayOf(5, 1, 4, 2), 6))
}

private class Solution {

    /**
     * It's my first approach
     */

    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var count = 0
        var left = 0
        var right = people.size - 1
        while (left <= right) {
            if (people[left] + people[right] > limit) {
                right--
            } else {
                left++
                right--
            }
            count++
        }
        return count
    }

}