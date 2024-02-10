package q2696

fun main() {
    val sl = Solution()
    println(sl.minLength("ABFCACDB"))
}

private class Solution {
    fun minLength(s: String): Int {
        val stack = mutableListOf<Char>()
        for (letter in s) {
            if (stack.isNotEmpty() &&
                (stack.last() == 'A' && letter == 'B' ||
                        stack.last() == 'C' && letter == 'D')
            ) {
                stack.removeAt(stack.size - 1)
            } else {
                stack.add(letter)
            }
        }
        return stack.size
    }
//    fun minLength(s: String): Int {
//        val deque = LinkedList<Char>()
//        for (letter in s) {
//            if (deque.isEmpty()) {
//                deque.offerLast(letter)
//            } else {
//                if (deque.peekLast() == 'A' && letter == 'B'
//                    || deque.peekLast() == 'C' && letter == 'D'
//                ) {
//                    deque.pollLast()
//                } else {
//                    deque.offerLast(letter)
//                }
//            }
//        }
//        return deque.size
//    }
//    fun minLength(s: String): Int {
//        val builder = StringBuilder(s)
//        var first = builder.contains("AB")
//        var second = builder.contains("CD")
//        while (first || second) {
//            if (first) {
//                val index = builder.indexOf("AB")
//                builder.delete(index, index + 2)
//            }
//            if (second) {
//                val index = builder.indexOf("CD")
//                builder.delete(index, index + 2)
//            }
//            first = builder.contains("AB")
//            second = builder.contains("CD")
//        }
//        return builder.length
//    }
//    fun minLength(s: String): Int {
//        var first = s.contains("AB")
//        var second = s.contains("CD")
//        var text = s
//        while (first || second) {
//            if (first) {
//                val index = text.indexOf("AB")
//                text = text.removeRange(index, index + 2)
//            }
//            if (second) {
//                val index = text.indexOf("CD")
//                text = text.removeRange(index, index + 2)
//            }
//            first = text.contains("AB")
//            second = text.contains("CD")
//        }
//        return text.length
//    }
}