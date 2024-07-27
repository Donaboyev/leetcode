package book.array

fun main() {
    val solution = Solution()
    println(solution.summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
}

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) {
            return listOf()
        }
        val result = mutableListOf<String>()
        var i = 0
        var startElement = nums[i]
        var endElement = nums[i]
        while (i < nums.size) {
            i++
            if (i < nums.size) {
                endElement = nums[i]
                if (endElement - startElement > 1) {
                    result.add("$startElement->$endElement")
                }
            } else {
                if (startElement == endElement) {
                    result.add(startElement.toString())
                } else {
                    result.add("$startElement->$endElement")
                }
            }
        }
        return result
    }
}