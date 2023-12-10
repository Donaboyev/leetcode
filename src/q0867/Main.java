package q0867;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(Arrays.deepToString(sn.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }
}

class Solution {
    public int[][] transpose(int[][] matrix) {
        final int c = matrix[0].length;
        final int r = matrix.length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }
//    public int[][] transpose(int[][] matrix) {
//        int[][] t = new int[matrix[0].length][matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                t[j][i] = matrix[i][j];
//            }
//        }
//        return t;
//    }
}
