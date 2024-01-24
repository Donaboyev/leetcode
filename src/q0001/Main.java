package q0001;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(Arrays.toString(sn.twoSum(new int[]{3, 3}, 6)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 1};
    }
}
