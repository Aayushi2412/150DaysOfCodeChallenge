// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//   Input: head = [1,1,2]
// Output: [1,2]
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode cur=head;
        while(cur.next!=null)
        {
            if(cur.val==cur.next.val) cur.next=cur.next.next;
            else cur=cur.next;
        }
        return head;
    }
}
