package top_interview150.q0027

fun main() {
    val sl = Solution()
    println(sl.removeElement(intArrayOf(3, 2, 2, 3), 3))
}

private class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[count] = nums[i]
                count++
            }
        }
        return count
    }
//    fun removeElement(nums: IntArray, `val`: Int): Int {
//        var i = 0
//        var j = nums.size - 1
//        while (i <= j) {
//            if (nums[i] == `val`) {
//                if (nums[j] == `val`) {
//                    j--
//                    continue
//                }
//                nums[i] = nums[j]
//                j--
//                i++
//                continue
//            }
//            i++
//        }
//        return i
//    }
}