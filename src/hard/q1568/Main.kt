package hard.q1568

fun main() {
    val sl = Solution()
    println(sl.minDays(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 0))))
}

private class Solution {
    var time: Int = 0
    lateinit var vis: Array<IntArray>
    lateinit var low: Array<IntArray>
    var d: IntArray = intArrayOf(0, 1, 0, -1, 0)
    var arti: Boolean = false

    fun minDays(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        arti = false
        vis = Array(n) { IntArray(m) }
        low = Array(n) { IntArray(m) }
        time = 1
        val hasArt = false
        var found = false
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j] == 1) {
                    if (found) return 0
                    found = true
                    art(i, j, grid, -100, -100)
                }
            }
        }

        if (time == 1) return 0

        if (time == 2) return 1
        return if (arti) 1
        else 2
    }

    fun art(row: Int, col: Int, grid: Array<IntArray>, parRow: Int, parCol: Int) {
        grid[row][col] = 0
        vis[row][col] = time
        low[row][col] = time
        time++
        var child = 0
        for (i in 0..3) {
            val x = d[i] + row
            val y = d[i + 1] + col

            if (x < 0 || y < 0 || x >= grid.size || y >= grid[0].size || (x == parRow && y == parCol) || (vis[x][y] == 0 && grid[x][y] == 0)) continue
            if (vis[x][y] == 0) {
                child++
                art(x, y, grid, row, col)
                low[row][col] = low[row][col].coerceAtMost(low[x][y])
                if (low[x][y] >= vis[row][col] && (parRow != -100 && parCol != -100)) arti = true
            } else {
                low[row][col] = low[row][col].coerceAtMost(vis[x][y])
            }
        }

        if (parRow == -100 && parCol == -100 && child > 1) arti = true
    }
}