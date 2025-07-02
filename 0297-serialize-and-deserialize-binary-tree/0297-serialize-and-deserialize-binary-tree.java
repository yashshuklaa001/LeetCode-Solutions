/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }
    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return; // missing in your code
        }
        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr));
        return deserializeHelper(queue);
    }
    private TreeNode deserializeHelper(Queue<String> queue) {
        String nodeData = queue.poll();
        if (nodeData.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodeData));
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        return node;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));