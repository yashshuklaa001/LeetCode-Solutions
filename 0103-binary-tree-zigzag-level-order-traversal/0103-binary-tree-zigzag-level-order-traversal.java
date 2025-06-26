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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> bigList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return bigList;
        }
        queue.add(root);
        int lev=0;
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer> smallList = new ArrayList<>();
            lev++;
            for(int i=0;i<level;i++){
                TreeNode current = queue.remove();
                smallList.add(current.val);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            if(lev%2==0){
                Collections.reverse(smallList);
            }
            bigList.add(smallList);
        }
        return bigList;
    }
}