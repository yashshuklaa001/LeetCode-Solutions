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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode current = head;
        ListNode prev = null;

        while (current != null && current.next != null) {
            ListNode first = current;
            ListNode second = current.next;
            ListNode nextPair = second.next; // Define nextPair correctly

            // Swap
            second.next = first;
            first.next = nextPair;

            // Connect previous pair to current
            if (prev != null) {
                prev.next = second;
            }

            // Move pointers
            prev = first;
            current = nextPair;
        }

        return newHead;
    }
}
