**
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
    public ListNode partition(ListNode head, int x) {
        //partition nodes of the LL such that all nodes<x come before nodes>x
        //if(head==null || head.next==null) return head;
        ListNode l1=new ListNode(0);        //smaller list
        ListNode l2=new ListNode(0);       //greater list
        ListNode small=l1;
        ListNode higher=l2;

        while(head!=null)
        {
            if(head.val<x)
            {
                //smaller list
                small.next=head;
                small=small.next;
            }
            else
            {
                //greater list
                higher.next=head;
                higher=higher.next;
            }
            head=head.next;
        }
        //join both the lists small+higher
        //point the last node of higher to null
        higher.next=null;
        small.next=l2.next;    //join
        return l1.next;
    }
}
