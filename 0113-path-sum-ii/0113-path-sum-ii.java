/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> big = new ArrayList<>();
        dfs(big, new ArrayList<>(), root, targetSum);
        return big;
    }

    private void dfs(List<List<Integer>> big, List<Integer> small, TreeNode root, int target) {
        if (root == null) return;
        small.add(root.val);
        if (root.left == null && root.right == null && target == root.val) {
            big.add(new ArrayList<>(small));
        } else {
            dfs(big, small, root.left, target - root.val);
            dfs(big, small, root.right, target - root.val);
        }
        small.remove(small.size() - 1);
    }
}
