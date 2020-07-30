package com.solo;

import java.util.HashMap;
import java.util.Map;

public class M930 {
    public int numSubarraysWithSum(int[] A, int S) {
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        int ans = 0, sum = 0;

        for (int i = 0; i < A.length; i++) {
            // Found one array
            sum += A[i];
            if (sum == S) ans++;

            // Check if there is any subarray with sum-S
            // If there is, then they all can form a new subarray ending at index i
            ans += cnt.getOrDefault(sum-S, 0);

            // Put the counts of occurrences into a map.
            int count = cnt.getOrDefault(sum, 0);
            cnt.put(sum, count+1);
        }

        return ans;
    }
}
