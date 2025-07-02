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
    ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode prev=null;
        ListNode next=null;
        int count =1;
        while(count<left){
            prev=curr;
            curr=curr.next;
            count++;
        }
        ListNode start= curr;
        while(count!=right){
            curr=curr.next;
            count++;
        }
        next=curr.next;
        curr.next=null;
        ListNode newHead = reverse(start);
        if(prev!=null){
            prev.next=newHead;
        }
        start.next=next;
        if(left==1){
            return newHead;
        }
        return head;
    }
}