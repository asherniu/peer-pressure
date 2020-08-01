package com.solo;

public class E198 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] robs = new int[nums.length + 2];

        for (int i = 0; i < nums.length; i++) {
            robs[i+2] = Math.max(robs[i] + nums[i], robs[i+1]);
        }

        return robs[nums.length + 1];
    }
}
