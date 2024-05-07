package daily_challenges.d07052024q2816

import java.util.Stack

fun main() {
    val sl = Solution()
    sl.doubleIt(ListNode(5))
}

private class Solution {

    fun doubleIt(head: ListNode?): ListNode? {
        val values = Stack<Int>()
        var value = 0
        var updatedHead = head

        while (updatedHead != null) {
            values.push(updatedHead.`val`)
            updatedHead = updatedHead.next
        }

        var newTail: ListNode? = null

        while (values.isNotEmpty() || value !=0) {
            newTail = ListNode(0).apply { next = newTail  }
            if (values.isNotEmpty()) {
                value += values.pop() *2
            }
            newTail.`val`= value%10
            value /= 10
        }

        return newTail
    }

//    fun doubleIt(head: ListNode?): ListNode? {
//        val reversedList = reverseList(head)
//        var carry = 0
//        var current = reversedList
//        var previous: ListNode? = null
//
//        while (current != null) {
//            val newValue = (current.`val` ?: 0) * 2 + carry
//            current.`val` = newValue % 10
//            carry = if (newValue > 9) {
//                1
//            } else {
//                0
//            }
//            previous = current
//            current = current.next
//        }
//
//        if (carry != 0) {
//            val extraNode = ListNode(carry)
//            previous?.next = extraNode
//        }
//
//        val result = reverseList(reversedList)
//        return result
//    }

//    private fun reverseList(node: ListNode?): ListNode? {
//        var previous: ListNode? = null
//        var current = node
//        var nextNode: ListNode?
//
//        while (current != null) {
//            nextNode = current.next
//            current.next = previous
//            previous = current
//            current = nextNode
//        }
//
//        return previous
//    }
}

class ListNode(var `val`: Int?) {
    var next: ListNode? = null
}
