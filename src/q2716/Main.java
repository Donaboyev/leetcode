package q2716;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.minimizedStringLength("aaabc"));
    }
}

class Solution {
    public int minimizedStringLength(String s) {
        final char[] letters = s.toCharArray();
        int[] unique = new int[26];
        for (final char letter : letters) {
            unique[letter - 'a'] = 1;
        }
        int count = 0;
        for (final int item : unique) {
            if (item == 1) {
                count++;
            }
        }
        return count;
    }
//    public int minimizedStringLength(String s) {
//        int count = 0;
//        final char[] letters = s.toCharArray();
//        char[] unique = new char[letters.length];
//        for (final char letter : letters) {
//            if (!containsChar(unique, letter)) {
//                unique[count++] = letter;
//            }
//        }
//        return count;
//    }

//    private boolean containsChar(char[] unique, char letter) {
//        for (final char item : unique) {
//            if (item == letter) {
//                return true;
//            }
//        }
//        return false;
//    }
}
