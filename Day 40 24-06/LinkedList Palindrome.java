/*
Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.
Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false

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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode mid=middle(head);
        ListNode rev=reverse(mid);
        ListNode left=head;
        ListNode right=rev;
        while(right!=null)
        {
            if(left.val!=right.val) return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode cur=head, prev=null;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
        
}
