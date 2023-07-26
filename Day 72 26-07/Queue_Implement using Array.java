import java.util.*;
public class Queue
  {
    int[] arr;
    int size=10001;
    int front;
    int rear;
    int size;
    Queue(int size)
    {
      arr=new int[size];
      front=0;
      rear=0;
    }

    boolean isEmpty()
    {
      if(front==rear) return true;
      return false;
      //return front==rear;
    }

void enqueue(int x)
    {
      if(rear=size-1)return;                //if(rear=size-1) i.e. the queue is full
      else
      {
        arr[rear]=x;
        rear++;
      }
    }
int dequeue()
    {
      if(front==rear) return -1;       //the queue is empty
      int ans=arr[front];
      arr[front]=-1;
      front++;
      if(front==rear) {
        front=0;
        rear=0;
      }
      return ans;
    }
int findFront()
    {
      if(front==rear) return -1;     //the queue is empty
      return arr[front];
    }

  }
  
