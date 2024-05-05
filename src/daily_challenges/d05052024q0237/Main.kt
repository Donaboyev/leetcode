package daily_challenges.d05052024q0237

fun main() {
    val sl = Solution()
    sl.deleteNode(ListNode(5))
}

private class Solution {

    /**
     * It's my first approach
     */

    fun deleteNode(node: ListNode?) {
        node?.`val` = node?.next?.`val`
        node?.next = node?.next?.next
    }

}

class ListNode(var `val`: Int?) {
    var next: ListNode? = null
}
