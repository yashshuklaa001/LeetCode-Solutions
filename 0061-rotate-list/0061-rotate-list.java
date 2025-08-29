class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = getLength(head);
        k = k % length;
        if (k == 0) return head;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
    public int getLength(ListNode start) {
        int length = 0;
        while (start != null) {
            start = start.next;
            length++;
        }
        return length;
    }
}
