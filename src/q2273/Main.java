package q2273;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.removeAnagrams(new String[]{"a"}));
    }
}

class Solution {
    public List<String> removeAnagrams(String[] words) {
        final List<String> list = new java.util.ArrayList<>(List.of(words));
        if (list.size() == 1) {
            return list;
        }
        int i = 0;
        while (i < list.size() - 1) {
            if (isAnagram(list.get(i), list.get(i + 1))) {
                list.remove(i + 1);
                continue;
            }
            i++;
        }
        return list;
    }

    private boolean isAnagram(String first, String second) {
        final char[] firstLetters = first.toCharArray();
        final char[] secondLetters = second.toCharArray();
        final int[] frequency = new int[26];
        for (final char item : firstLetters) {
            frequency[item - 'a']++;
        }
        for (final char item : secondLetters) {
            frequency[item - 'a']--;
        }
        for (final int item : frequency) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }
}
