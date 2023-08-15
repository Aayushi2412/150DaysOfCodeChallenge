/*
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.
Example 1:
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:
Input: head = [2,1], x = 2
Output: [1,2]
Constraints:
The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200
*/
//code
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
