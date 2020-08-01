package com.solo;

public class M213 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int rob1 = rob(nums, 0, nums.length - 2);
        int rob2 = rob(nums, 1, nums.length - 1);

        return Math.max(rob1, rob2);

    }

    public int rob(int[] nums, int start, int end) {
        int t1 = 0;
        int t2 = 0;

        for (int i = start; i <= end; i++) {
            int temp = t1;
            int current = nums[i];
            t1 = Math.max(current + t2, t1);
            t2 = temp;
        }

        return t1;
    }
}
