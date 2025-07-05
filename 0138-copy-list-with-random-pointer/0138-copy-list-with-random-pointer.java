/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node current=head;
        while(current!=null){
            Node copy = new Node(current.val);
            copy.next=current.next;
            current.next=copy;
            current=current.next;
            current=copy.next;
        }

        current = head;
        while(current!=null){
            if(current.random!=null){
            current.next.random=current.random.next;
            }
            current=current.next.next;
        }
        current=head;
        Node pseudoHead = new Node(0);
        Node copyCurrent = pseudoHead;
        while(current!=null){
            Node nextOriginal = current.next.next;
            copyCurrent.next=current.next;
            current.next=nextOriginal;

            copyCurrent=copyCurrent.next;
            current=nextOriginal;
        }
        return pseudoHead.next;
    }
}