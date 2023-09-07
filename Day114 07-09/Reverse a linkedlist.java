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
      //base case
      if(head==null || head.next!=null) return head;
      
      ListNode prev=head, cur=head.next;
      while(cur!=null)
        {
          ListNode next=cur.next;
          cur.next=prev;
          prev=cur;
          cur=next;
        }
      head.next=null;
      head=prev;
      retrun head;
    }
  }
