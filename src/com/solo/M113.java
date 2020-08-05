package com.solo;

import java.util.ArrayList;
import java.util.List;

public class M113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        pathSumHelper(ans, new ArrayList<>(), root, sum);
        return ans;
    }

    public void pathSumHelper(List<List<Integer>> ans, List<Integer> curr, TreeNode root, int sum) {
        if (root == null) return;
        curr.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            ans.add(new ArrayList<>(curr));
            curr.remove(curr.size() - 1);
            return;
        }
        pathSumHelper(ans, curr, root.left, sum - root.val);
        pathSumHelper(ans, curr, root.right, sum - root.val);
        curr.remove(curr.size() - 1);
    }
}
