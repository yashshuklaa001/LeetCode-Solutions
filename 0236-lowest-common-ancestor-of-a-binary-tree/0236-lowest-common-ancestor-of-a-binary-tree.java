class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }
        // Recurse on left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // If p and q found in different subtrees, root is LCA
        if (left != null && right != null) {
            return root;
        }
        // Else return non-null child (either left or right)
        return left != null ? left : right;
    }
}
