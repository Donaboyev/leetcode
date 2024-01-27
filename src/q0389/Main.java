package q0389;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.findTheDifference("abcd", "abcde"));
    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        final char[] tLetters = t.toCharArray();
        final char[] sLetters = s.toCharArray();
        final int[] frequency = new int[26];
        for (final char item : tLetters) {
            frequency[item - 'a']++;
        }
        for (final char item : sLetters) {
            frequency[item - 'a']--;
        }
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 1) {
                index = i;
                break;
            }
        }
        return (char) ('a' + index);
    }
}
