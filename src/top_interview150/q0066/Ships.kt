package top_interview150.q0066

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val l = IntArray(n)
    val L = IntArray(m)
    for (i in l.indices) {
        l[i] = scanner.nextInt()
    }
    for (i in L.indices) {
        L[i] = scanner.nextInt()
    }

    scanner.close()
}

object Hamming {

}
