package q2744;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
    }
}

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        if (words.length == 1) {
            return 0;
        }
        int[] indexes = new int[words.length];
        Arrays.fill(indexes, -1);
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((words[i].charAt(0) == words[j].charAt(1))
                        && (words[i].charAt(1) == words[j].charAt(0))
                        && !checkContains(indexes, i, j)) {
                    indexes[count] = i;
                    indexes[count + 1] = j;
                    count++;
                }
            }
        }
        return count;
    }

    private boolean checkContains(int[] array, int left, int right) {
        for (final int item : array) {
            if (item == left || item == right) {
                return true;
            }
        }
        return false;
    }
}
