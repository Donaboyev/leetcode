package daily_challenges.d06052024q2487

fun main() {
    val sl = Solution()
    sl.removeNodes(ListNode(5))
}

private class Solution {

    fun removeNodes(head: ListNode?): ListNode? {
        val reversedHead = reverseList(head)

        var maximum = 0
        var prev: ListNode? = null
        var curr: ListNode? = reversedHead

        while (curr != null) {
            maximum = maxOf(maximum, curr.`val` ?: 0)

            if (curr.`val` != null && curr.`val`!! < maximum) {
                prev?.next = curr
                val deleted = curr
                curr = curr.next
                deleted.next = null
            } else {
                prev = curr
                curr = curr.next
            }
        }

        return reverseList(reversedHead)
    }

    private fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr: ListNode? = head
        var nextTemp: ListNode?

        while (curr != null) {
            nextTemp = curr.next
            curr.next = prev
            prev = curr
            curr = nextTemp
        }

        return prev
    }

//    fun removeNodes(head: ListNode?): ListNode? {
//        if (head?.next == null) {
//            return head
//        }
//
//        val nextNode = removeNodes(head.next)
//
//        if (nextNode?.`val` != null && head.`val` != null && head.`val`!! < nextNode.`val`!!) {
//            return nextNode
//        }
//
//        head.next = nextNode
//
//        return head
//    }

//    fun removeNodes(head: ListNode?): ListNode {
//        val stack = Stack<ListNode>()
//        var current = head
//        while (current != null) {
//            stack.push(current)
//            current = current.next
//        }
//
//        current = stack.pop()
//        var maximum = current.`val`
//        var resultList = ListNode(maximum)
//
//        while (!stack.empty()) {
//            current = stack.pop()
//            if (maximum != null && current.`val` != null && current.`val`!! < maximum) {
//                continue
//            } else {
//                val node = ListNode(current.`val`)
//                node.next = resultList
//                resultList = node
//                maximum = current.`val`
//            }
//        }
//
//        return resultList
//    }

}

class ListNode(var `val`: Int?) {
    var next: ListNode? = null
}
