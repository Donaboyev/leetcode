package easy.q1089

fun main() {
    val sl = Solution()
    println(sl.duplicateZeros(intArrayOf(2, 2, 0, 1)))
}

private class Solution {
    fun duplicateZeros(arr: IntArray) {
        var possibleDuplicates = 0
        var length = arr.size - 1
        var left = 0
        while (left <= length - possibleDuplicates) {
            if (arr[left] == 0) {
                if (left == length - possibleDuplicates) {
                    arr[length] = 0
                    length--
                    break
                }
                possibleDuplicates++
            }
            left++
        }
        val last = length - possibleDuplicates
        for (i in last downTo 0) {
            if (arr[i] == 0) {
                arr[i + possibleDuplicates] = 0
                possibleDuplicates--
                arr[i + possibleDuplicates] = 0
            } else {
                arr[i + possibleDuplicates] = arr[i]
            }
        }
        println(arr.joinToString())
    }
//    fun duplicateZeros(arr: IntArray) {
//        var i = 0
//        while (i < arr.size - 1) {
//            if (arr[i] == 0) {
//                for (j in arr.size - 1 downTo i + 2) {
//                    arr[j] = arr[j - 1]
//                }
//                arr[i + 1] = 0
//                i += 2
//            } else {
//                i++
//            }
//        }
//        println(arr.joinToString())
//    }
}