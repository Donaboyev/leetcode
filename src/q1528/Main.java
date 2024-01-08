package q1528;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {
        final char[] sc = s.toCharArray();
        char[] n = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            n[indices[i]] = sc[i];
        }
        return String.valueOf(n);
    }

}