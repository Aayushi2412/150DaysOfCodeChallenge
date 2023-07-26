class MyCircularQueue {
    int[] arr;
    int front=0;
    int rear=-1;
    int size=0;
    public MyCircularQueue(int k) {
        arr=new int[k];
    }
    
    public boolean enQueue(int value) {
        //if((front ==0 && rear==size-1)||(rear==(front-1)%(size-1)))
        //queue is full
        if(!isFull())
        {
            rear=(rear+1)%arr.length;
            arr[rear]=value;
            size++;
            return true;
        }
        else return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty())
        {
            front=(front+1)%arr.length;
            size--;
            return true;
        }
        else return false;
    }
    
    public int Front() {
        return isEmpty()?-1:arr[front];
        //return arr[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:arr[rear];
        //return arr[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==arr.length;
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
