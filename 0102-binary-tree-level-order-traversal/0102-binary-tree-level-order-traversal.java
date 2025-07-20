class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> biglist = new ArrayList<>();
        if (root == null) {
            return biglist;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> smallList = new ArrayList<>();
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode current = queue.remove();
                smallList.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            biglist.add(smallList);
        }

        return biglist;
    }
}
