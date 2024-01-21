package q2899;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.lastVisitedIntegers(List.of("1", "prev", "2", "prev", "prev")));
    }
}

class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        final List<Integer> nums = new ArrayList<>();
        final List<Integer> reverse = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("prev")) {
                k++;
                if (k > nums.size()) {
                    reverse.add(-1);
                } else {
                    reverse.add(nums.get(nums.size() - k));
                }
            } else {
                k = 0;
                nums.add(Integer.parseInt(words.get(i)));
            }
        }
        return reverse;
    }
}
