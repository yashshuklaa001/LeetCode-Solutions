class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int cur, int target) {
        if (node == null) return false;
        cur += node.val;
        if (node.left == null && node.right == null) {
            return cur == target;
        }
        return dfs(node.left, cur, target) || dfs(node.right, cur, target);
    }
}
