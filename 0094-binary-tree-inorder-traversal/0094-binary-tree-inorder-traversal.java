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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        if(root==null){
            return list;
        }
        while(current!=null|| !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current=current.right;
        }
        return list;
    }
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalHelper(root,list);
        return list;
    }
    void inorderTraversalHelper(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        inorderTraversalHelper(root.left,result);
        result.add(root.val);
        inorderTraversalHelper(root.right,result);
    }
}