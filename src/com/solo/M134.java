package com.solo;

public class M134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int[] diff = new int[len*2];
        for (int i = 0; i < len; i++) {
            diff[i] = gas[i] - cost[i];
            diff[i + len] = gas[i] - cost[i];
        }
        int ans = -1;
        for (int i = 0; i < len; i++) {
            if (diff[i] < 0) continue;
            int sum = 0;
            for (int j = i; j < len + i; j++){
                sum += diff[j];
                if (sum < 0)
                    break;
            }
            if (sum >= 0) return i;
        }
        return ans;
    }
}
