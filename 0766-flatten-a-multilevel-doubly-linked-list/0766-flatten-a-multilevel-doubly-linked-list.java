/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        flattenDFS(head);
        return head;
    }
    private Node flattenDFS(Node node) {
        Node current = node;
        Node last = null;
        while (current != null) {
            Node next = current.next;
            if (current.child != null) {
                Node childLast = flattenDFS(current.child);
                current.next = current.child;
                current.child.prev = current;
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }
                current.child = null;
                last = childLast;
            } else {
                last = current;
            }
            current = next;
        }
        return last;
    }
}
