class MyCircularQueue {
    int arr[];
    int count;
    int size;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        arr=new int[k];
        size=k;
        front=0;
        rear=0;
        count=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arr[rear]=value;
        rear=(rear+1)%size;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%size;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1; 
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(rear-1+size)%size];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */