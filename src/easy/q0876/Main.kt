package easy.q0876

fun main() {
    val sl = Solution()
    println(sl.middleNode(ListNode(5)))
}


private class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var middle = head
        var end = head
        while (end?.next != null) {
            middle = middle?.next
            end = end.next?.next
        }
        return middle
    }
//    fun middleNode(head: ListNode?): ListNode? {
//        var currentHead = head
//        val array = mutableListOf<ListNode>()
//        var length = 0
//        while (currentHead != null) {
//            array.add(currentHead)
//            currentHead = currentHead.next
//            length++
//        }
//        return array[length / 2]
//    }
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 *
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
