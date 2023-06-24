//Given the head of a singly linked list, reverse the list, and return the reversed list.
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
//code
/**
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
    public ListNode reverseList(ListNode head) {
        // Iterative Approach  tc=O(n) sc=O(1)
        //corner cases
        // if(head==null || head.next==null)
        //     return head;
        // ListNode prev=head;
        // ListNode cur=head.next;
        // while(cur!=null)
        // {
        //     ListNode next=cur.next;
        //     cur.next=prev;
        //     prev=cur;
        //     cur=next;
        // }
        // head.next=null;
        // head=prev;
        // return head;

        //Recursive Approach    tc=O(n) , sc=O(1)
        //base case
        if(head==null || head.next==null)
            return head;
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
        
    }
}
