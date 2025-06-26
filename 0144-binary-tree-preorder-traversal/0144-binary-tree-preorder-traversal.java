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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();//Empty List
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            //push right value then left value
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }
    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderHelper(root,list);
        return list;
    }

    void preOrderHelper(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        preOrderHelper(root.left,result);
        preOrderHelper(root.right,result);
    }
}