// Approach - 2 Using Doubly LinekdList
class Node{
    int val; // for the data (Instance Variable)
    Node next; // for the next node reference (Default value is null)
    Node prev; // for the prev node reference (Default value is null)
    // Constructor 

    Node(int val){ // Local Variable
        this.val = val; // Instance Var = Local Var
    }
}
// class Node<T>{
//     T data;
//     Node<T> next;
// }
//Node<String> node = new Node<>("Amit");
//Node<Integer> node = new Node<>(100);
class MyLinkedList {
    int size; // total number of nodes
    Node head; // head contains the reference of the first node
    Node tail; // tail contains the reference of the last node
    public MyLinkedList() {
        size = 0;
    }
    // get O(N)
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        else{
            Node temp = head;
            for(int i = 0; i<index;i++){
                temp = temp.next;
            }
            return temp.val;
        }
    }
    // TC O(1)
    public void addAtHead(int val) {
        // Create a New Node
        Node node = new Node(val);
        size++;
        // No LinkedList exist
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node; // this is for doubly
            head = node;
        }
    }
    // TC O(1)
    public void addAtTail(int val) {
        // Create a New Node
        Node node = new Node(val);
        size++;
        // No LinkedList exist
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
            // Node temp = head;
            // while(temp.next!=null){
            //     temp = temp.next;
            // }
            // temp.next = node; // Link at end
           
        }
    }
    
    // TC O(N)
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return ; // Invalid Index
        }
        if(index ==0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node node = new Node(val);
            Node temp = head;
            // Add at Middle
            for(int i = 0; i<index-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node; // For Doubly LL
            temp.next = node;
            node.prev = temp;  // For Doubly LL
           
            size++;
        }
    }
    
    // TC O(N)
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return ;
        }
        // NO LinkedList Exist
        if(head == null){
            return ;
        }
        if(index==0){
            head = head.next;
           
        }
        else if(index == size - 1){
            // last node
           tail = tail.prev;
           if(tail!=null){
            tail.next= null;
           }
           else{
            head = null;
           }

        }
        else{
            // delete in middle
            Node temp = head;
            // for doubly LL i<index
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
            // for Doubly LinkedList
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
         size--;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */