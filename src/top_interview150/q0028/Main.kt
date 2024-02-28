package top_interview150.q0028

fun main() {
    val sl = Solution()
    println(sl.strStr("hello", "ll"))
}

private class Solution {

    // https://algodaily.com/challenges/detect-substring-in-string
    fun strStr(haystack: String, needle: String): Int {
        if (haystack.length < needle.length) {
            return -1
        }
        var j = 0
        var i = 0
        while (i < haystack.length) {
            if (haystack[i] == needle[j]) {
                j++
                if (j == needle.length) {
                    return i - (needle.length - 1)
                }
            } else {
                i -= j
                j = 0
            }
            i++
        }
        return -1
    }

//    fun strStr(haystack: String, needle: String): Int {
//        if (needle.length > haystack.length) {
//            return -1
//        }
//        for (i in 0 until haystack.length - needle.length + 1) {
//            if (haystack.substring(i, needle.length + i) == needle) {
//                return i
//            }
//        }
//        return -1
//    }

    // Brute force approach
//    fun strStr(haystack: String, needle: String): Int {
//        if (needle.length > haystack.length) {
//            return -1
//        }
//        for (i in haystack.indices) {
//            var contains = true
//            for (j in needle.indices) {
//                if (i + j >= haystack.length) {
//                    return -1
//                }
//                if (haystack[i + j] != needle[j]) {
//                    contains = false
//                    break
//                }
//            }
//            if (contains) {
//                return i
//            }
//        }
//        return -1
//    }

//    fun strStr(haystack: String, needle: String): Int {
//        if (haystack.contains(needle)) {
//            return haystack.indexOf(needle)
//        }
//        return -1
//    }
}