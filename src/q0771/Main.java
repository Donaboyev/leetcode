package q0771;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.numJewelsInStones("aA", "aAAbbbb"));
    }
}

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        final char[] jCh = jewels.toCharArray();
        final char[] sCh = stones.toCharArray();
        for (final char j : jCh) {
            for (final char s : sCh) {
                if (j == s) {
                    c++;
                }
            }
        }
        return c;
    }
//    public int numJewelsInStones(String jewels, String stones) {
//        int c = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            for (int j = 0; j < stones.length(); j++) {
//                if (jewels.charAt(i) == stones.charAt(j)) {
//                    c++;
//                }
//            }
//        }
//        return c;
//    }
//    public int numJewelsInStones(String jewels, String stones) {
//        int c = 0;
//        for (final char j : jewels.toCharArray()) {
//            for (final char s : stones.toCharArray()) {
//                if (j == s) {
//                    c++;
//                }
//            }
//        }
//        return c;
//    }
}
