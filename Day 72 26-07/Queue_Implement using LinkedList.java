import java.util.*;

public class Queue
{
  LinkedList<Integer>q;
  Queue()
  {
    q=new LinkedList<>();
  }
  boolean isEmpty()
  {
    return q.isEmpty();
  }
  void enqueue(int x)
  {
    q.addLast(x);
  }
  int dequeue()
  {
    is(isEmpty())return -1;
    return q.removeFirst();
  }
  int front()
  {
    if(isEmpty()) return -1;
    return q.getFirst();
  }
}
