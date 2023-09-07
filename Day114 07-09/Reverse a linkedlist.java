/*
Definition of a LinkedList
public class ListNode
{
  int val;
  ListNode next;
  ListNode();
  ListNode(int val){ this.val=val;}
  ListNode(int val, ListNode next){
    this.val=val;
    this.next=next;
  }
}
*/


//1st approach: Iterative
class Sol
  {
    public ListNode revList(ListNode head)
    {
      ListNode cur=null;
      while(head!=null)
        {
          ListNode next=head.next;
          head.next=cur;
          cur=head;
          head=next;
        }
      return cur;
    }
}
