
class Q622_DesignCircularQueue {

    private int[] list;
    private int capacity;
    private int front=-1;
    private int end=-1;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public Q622_DesignCircularQueue(int k) {
        list = new int[k];
        capacity=k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (this.isFull()) return false;
        if (this.isEmpty()) front++;
        end = (end+1)%capacity;
        list[end]=value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(this.isEmpty()) return false;
        if(front==end){
            front=-1;
            end=-1;
            return true;
        }
        front = (front+1)%capacity;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
       return this.isEmpty() ? -1 : list[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return this.isEmpty() ? -1 : list[end];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front==-1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((end+1)%capacity == front);
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