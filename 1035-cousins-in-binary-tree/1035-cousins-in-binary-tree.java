class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean xFound = false, yFound = false;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null && current.right != null) {
                    int l = current.left.val, r = current.right.val;
                    if ((l == x && r == y) || (l == y && r == x)) {
                        return false;
                    }
                }
                if (current.val == x) xFound = true;
                if (current.val == y) yFound = true;
                if (current.left != null)  queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            if (xFound && yFound) return true;
            if (xFound || yFound) return false;
        }

        return false;
    }
}
