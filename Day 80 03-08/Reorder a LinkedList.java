// You are given the head of a singly linked-list. The list can be represented as:
// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:
// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.
// Example 1:
// Input: head = [1,2,3,4]
// Output: [1,4,2,3]
// Example 2:
// Input: head = [1,2,3,4,5]
// Output: [1,5,2,4,3]
// Constraints:
// The number of nodes in the list is in the range [1, 5 * 104].
// 1 <= Node.val <= 1000


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
        //approach 1:
        //copy head to curr and find last node
        //remove last node from its place and curr.next=last node
        //cur=cur.next
        //recusive call
        //tc=O(n^2)
        

        //approach 2:
        //copy list elements to an array
        //swap elements from both ends
        //copy array elements to a list again

class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        //1->2->3->4->5->6
        //find middle of the linkedlist using hare and turtle approach
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the 2nd half of the linkedlist   1->2->3->6->5->4
        ListNode preMiddle=slow;
        ListNode preCurrent=slow.next;
        while(preCurrent.next!=null)
        {
            ListNode curr=preCurrent.next;
            preCurrent.next=curr.next;
            curr.next=preMiddle.next;
            preMiddle.next=curr;
        }

        //reorder one by one     1->6->2->5->3->4
        slow=head;
        fast=preMiddle.next;
        while(slow!=preMiddle)
        {
            preMiddle.next=fast.next;
            fast.next=slow.next;
            slow.next=fast;
            slow=fast.next;
            fast=preMiddle.next;
        }
    }
}
