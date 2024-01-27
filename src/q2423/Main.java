package q2423;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.equalFrequency("bac"));
    }
}

class Solution {
    public boolean equalFrequency(String word) {
        final char[] letters = word.toCharArray();
        final int[] frequency = new int[26];
        for (final char item : letters) {
            frequency[item - 'a']++;
        }
        final int[] unique = new int[4];
        Arrays.fill(unique, -1);
        int count = 0;
        for (final int item : frequency) {
            if (!checkContains(unique, item)) {
                if (count >= 4) {
                    return false;
                }
                unique[count++] = item;
            }
        }
        System.out.println(Arrays.toString(unique));
        System.out.println(count);
        return count == 3;
    }

    private boolean checkContains(int[] array, int number) {
        for (final int item : array) {
            if (item == number && item > 0) {
                return true;
            }
        }
        return false;
    }
}
