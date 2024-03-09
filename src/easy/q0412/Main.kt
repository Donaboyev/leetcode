package easy.q0412

import java.util.LinkedList

fun main() {
    val sl = Solution()
    println(sl.fizzBuzz(3))
}

private class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val answer = ArrayList<String>()
        for (i in 1..n) {
            var currentString = ""
            if (i % 3 == 0) {
                currentString += "Fizz"
            }
            if (i % 5 == 0) {
                currentString += "Buzz"
            }
            if (currentString.isEmpty()) {
                currentString += i.toString()
            }
            answer.add(currentString)
        }
        return answer
    }
//    fun fizzBuzz(n: Int): List<String> {
//        val answer = mutableListOf<String>()
//        for (i in 1..n) {
//            when {
//                i % 15 == 0 -> answer.add("FizzBuzz")
//                i % 3 == 0 -> answer.add("Fizz")
//                i % 5 == 0 -> answer.add("Buzz")
//                else -> answer.add(i.toString())
//            }
//        }
//        return answer
//    }
//    fun fizzBuzz(n: Int): List<String> {
//        val answer = LinkedList<String>()
//        for (i in 1..n) {
//            when {
//                i % 15 == 0 -> answer.add("FizzBuzz")
//                i % 3 == 0 -> answer.add("Fizz")
//                i % 5 == 0 -> answer.add("Buzz")
//                else -> answer.add(i.toString())
//            }
//        }
//        return answer
//    }
}