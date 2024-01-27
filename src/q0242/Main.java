package q0242;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.isAnagram("aacc", "ccac"));
    }
}

class Solution {
    /**
     * This is only for String contains English lowercase alphabet letters
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        final int[] frequency = new int[26];
        final char[] sLetters = s.toCharArray();
        final char[] tLetters = t.toCharArray();
        for (final char item : sLetters) {
            frequency[item - 'a']++;
        }
        for (final char item : tLetters) {
            frequency[item - 'a']--;
        }
        for (final int item : frequency) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        final Hashtable<Character, Integer> sHash = new Hashtable<>();
//        final Hashtable<Character, Integer> tHash = new Hashtable<>();
//        final char[] sLetters = s.toCharArray();
//        final char[] tLetters = t.toCharArray();
//        for (final char item : sLetters) {
//            final int current = sHash.getOrDefault(item, 0);
//            sHash.put(item, current + 1);
//        }
//        for (final char item : tLetters) {
//            final int current = tHash.getOrDefault(item, 0);
//            tHash.put(item, current + 1);
//        }
//        for (final Character key : sHash.keySet()) {
//            if (!Objects.equals(sHash.getOrDefault(key, 0), tHash.getOrDefault(key, 0))) {
//                return false;
//            }
//        }
//        return true;
//    }
}
