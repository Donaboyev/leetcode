package daily_challenges.d10052024q0786

fun main() {
    val sl = Solution()
    println(sl.kthSmallestPrimeFraction(intArrayOf(1, 2, 3, 5), 3).joinToString())
}

private class Solution {

    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        val n = arr.size
        var left = 0.0
        var right = 1.0
        while (left < right) {
            val mid = (left + right) / 2
            var maxFraction = 0.0
            var totalSmallerFractions = 0
            var numeratorIdx = 0
            var denominatorIdx = 0
            var j = 1
            for (i in 0 until n) {
                while (j < n && arr[i] >= mid * arr[j]) {
                    j++
                }
                totalSmallerFractions += n - j
                if (j == n) {
                    break
                }
                val fraction: Double = arr[i].toDouble() / arr[j]
                if (fraction > maxFraction) {
                    maxFraction = fraction
                    numeratorIdx = i
                    denominatorIdx = j
                }
            }
            if (totalSmallerFractions == k) {
                return intArrayOf(arr[numeratorIdx], arr[denominatorIdx])
            } else if (totalSmallerFractions > k) {
                right = mid
            } else {
                left = mid
            }
        }
        return intArrayOf()
    }


    /**
     * It's my first approach
     */

//    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
//        val comparator = Comparator<Pair<Double, Double>> { a, b ->
//            val ratioA = a.first / a.second
//            val ratioB = b.first / b.second
//            ratioA.compareTo(ratioB)
//        }
//        val pq = PriorityQueue(comparator)
//        for (i in 0 until arr.size - 1) {
//            for (j in i + 1 until arr.size) {
//                pq.add(Pair(arr[i].toDouble(), arr[j].toDouble()))
//            }
//        }
//        val result = IntArray(2)
//        for (i in 0 until k) {
//            val p = pq.poll()
//            if (i == k - 1) {
//                result[0] = p.first.toInt()
//                result[1] = p.second.toInt()
//            }
//        }
//        return result
//    }
}