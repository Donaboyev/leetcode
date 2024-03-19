package easy.q0941

fun main() {
    val sl = Solution()
    println(sl.validMountainArray(intArrayOf(2, 1)))
}


private class Solution {

    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) {
            return false
        }
        var i = 0
        while (i < arr.size - 1 && arr[i] < arr[i + 1]) {
            i++
        }
        if (i == 0 || i == arr.size - 1) {
            return false
        }
        while (i < arr.size - 1 && arr[i] > arr[i + 1]) {
            i++
        }
        return i == arr.size - 1
    }
//    fun validMountainArray(arr: IntArray): Boolean {
//        if (arr.size < 3) {
//            return false
//        }
//        var i = 0
//        var j = arr.size - 1
//        while (i < arr.size - 1) {
//            if (arr[i] >= arr[i + 1]) {
//                break
//            }
//            i++
//        }
//        while (j > 1) {
//            if (arr[j] >= arr[j - 1]) {
//                break
//            }
//            j--
//        }
//        return i == j && i != 0 && j != arr.size - 1
//    }

}

