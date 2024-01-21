package q2899;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.lastVisitedIntegers(List.of("1", "2", "prev", "prev", "prev")));
    }
}

class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        final List<Integer> nums = new ArrayList<>();
        final List<Integer> nums_reverse = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < words.size(); i++) {
//            if (words.get(i).equals("prev")) {
//                k++;
//                num
//            } else {
//                nums.add(Integer.parseInt(words.get(i)));
//            }
        }
        return nums;
    }
}
