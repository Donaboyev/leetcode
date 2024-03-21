package easy.q1299

fun main() {
    val sl = Solution()
    println(sl.replaceElements(intArrayOf(17, 18, 5, 4, 6, 1)).joinToString())
}


private class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var rightMax = -1
        for (i in arr.size - 1 downTo 0) {
            val newMax = if (arr[i] > rightMax) {
                arr[i]
            } else {
                rightMax
            }
            arr[i] = rightMax
            rightMax = newMax
        }
        return arr
    }
//    fun replaceElements(arr: IntArray): IntArray {
//        for (i in 0 until arr.size - 1) {
//            var max = arr[i + 1]
//            for (j in i + 1 until arr.size) {
//                if (arr[j] > max) {
//                    max = arr[j]
//                }
//            }
//            arr[i] = max
//        }
//        arr[arr.size - 1] = -1
//        return arr
//    }
}