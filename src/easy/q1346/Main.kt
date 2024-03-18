package easy.q1346

fun main() {
    val sl = Solution()
    println(sl.checkIfExist(intArrayOf(10, 2, 5, 3)))
    println(sl.checkIfExist(intArrayOf(3, 1, 7, 11)))
    println(sl.checkIfExist(intArrayOf(7, 1, 14, 11)))
}


private class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val hashMap = HashMap<Int, Int>()
        val hashMapValue = HashMap<Int, Int>()
        hashMap[arr[arr.size - 1] * 2] = 0
        hashMapValue[arr[arr.size - 1]] = 0
        for (i in arr.size - 2 downTo 0) {
            if (hashMap.containsKey(arr[i]) || hashMapValue.containsKey(arr[i] * 2)) {
                return true
            }
            hashMap[arr[i] * 2] = 0
            hashMapValue[arr[i]] = 0
        }
        return false
    }
//    fun checkIfExist(arr: IntArray): Boolean {
//        for (i in arr.indices) {
//            for (j in arr.indices) {
//                if (i != j && arr[i] == 2 * arr[j]) {
//                    return true
//                }
//            }
//        }
//        return false
//    }
}