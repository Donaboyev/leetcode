package q0001

fun main() {
    val sl = KSolution()
    println(sl.twoSum(intArrayOf(-10, -1, -18, -19), -19).joinToString())
}

private class KSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val current = nums[i]
            val x = target - current
            if (map.containsKey(x)) {
                return intArrayOf(map[x]!!, i)
            }
            map[current] = i
        }
        return IntArray(0)
    }

//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val map = HashMap<Int, Int>()
//        for (i in nums.indices) {
//            val current = nums[i]
//            val x = target - current
//            if (map.containsKey(x)) {
//                return intArrayOf(map[x]!!, i)
//            }
//            map[current] = i
//        }
//        return IntArray(0)
//    }

//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        for (i in 0..(nums.size - 2)) {
//            for (j in (i + 1)..<nums.size) {
//                if (nums[i] + nums[j] == target) {
//                    return intArrayOf(i, j)
//                }
//            }
//        }
//        return IntArray(0)
//    }

//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val result = ArrayList<Int>()
//        for (i in 0..(nums.size - 2)) {
//            for (j in (i + 1)..<nums.size) {
//                if (nums[i] + nums[j] == target) {
//                    result.add(i)
//                    result.add(j)
//                    break
//                }
//            }
//        }
//        return result.toSet().toIntArray()
//    }

}