package easy.q3046

fun main() {
    val sl = Solution()
    println(sl.isPossibleToSplit(intArrayOf(1, 1, 2, 2, 3, 4)))
}

private class Solution {
    fun isPossibleToSplit(nums: IntArray): Boolean {
        val frequency = IntArray(101)
        for (item in nums) {
            frequency[item]++
            if (frequency[item] > 2) {
                return false
            }
        }
        return true
    }

//    fun isPossibleToSplit(nums: IntArray): Boolean {
//        val map = HashMap<Int, Int>()
//        for (item in nums) {
//            map[item] = map.getOrDefault(item, 0) + 1
//            if (map[item]!! > 2) {
//                return false
//            }
//        }
//        return true
//    }
}