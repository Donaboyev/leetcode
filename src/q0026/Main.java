package q0026;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(sn.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return nums.length;
        }
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int right = 1;
            while (nums[i] == nums[i + right]) {
                k++;
                if (i != nums.length - 2) {
                    nums[i + right] = nums[i + right + 1];
                }
                right++;
            }
        }
        return k;
    }
}
