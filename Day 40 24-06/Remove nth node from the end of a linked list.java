/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
*/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        if(head.next==null) return null;
        //size of the linkedList
        int size=0;
        ListNode cur=head;
        while(cur!=null)
        {
            cur=cur.next;
            size++;
        }
        if(n==size) return head.next;
        //prev node index
        int indx=size-n;
        int i=1;
        ListNode prev=head;
        while(i<indx)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
