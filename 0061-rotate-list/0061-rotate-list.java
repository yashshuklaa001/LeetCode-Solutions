/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = getLength(head);
        k = k % length;
        if (k == 0) return head;
        return rotateOnce(head, k);
    }
    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
    private ListNode rotateOnce(ListNode head, int k) {
        if (k == 0) return head;
        ListNode prev = null, current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        current.next = head;
        return rotateOnce(current, k - 1);
    }
}
