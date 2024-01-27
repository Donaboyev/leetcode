package q2418;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170})));
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        final SortedMap<Integer, String> mapped = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            mapped.put(heights[i], names[i]);
        }
        return mapped.values().toArray(new String[]{});
    }
}
