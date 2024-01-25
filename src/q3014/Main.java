package q3014;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.minimumPushes("abcd"));
    }
}

class Solution {
    public int minimumPushes(String word) {
        if (word.length() < 9) {
            return word.length();
        } else if (word.length() < 17) {
            return (word.length() - 8) * 2 + 8;
        } else if (word.length() < 25) {
            return (word.length() - 16) * 3 + 24;
        }
        return (word.length() - 24) * 4 + 48;
    }
}
