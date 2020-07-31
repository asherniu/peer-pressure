package com.solo;

public class M33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int k = (i + j) / 2;
            if (nums[k] == target) return k;
            else if (nums[k] >= nums[i])
                if (target >= nums[i] && target <= nums[k])
                    j = k;
                else
                    i = k + 1;
            else
            if (target >= nums[k] && target <= nums[j])
                i = k + 1;
            else
                j = k;
        }
        return -1;
    }
}
