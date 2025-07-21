// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int height(TreeNode root){
//         if(root==null){
//             return -1;
//         }
//         int left = height(root.left);
//         int right = height(root.right);
//         int max = Math.max(left,right);
//         return max+1;
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root==null){
//             return true;
//         }
//         int diff = Math.abs(height(root.left)-height(root.right));
//         if(diff>1){
//             return false;
//         }
//         return isBalanced(root.left) && isBalanced(root.right);
//     }
// }
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        if (left == -1) return -1;

        int right = checkHeight(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
