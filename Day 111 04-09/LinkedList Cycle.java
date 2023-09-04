/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //method 1
        //using HashSet
        // Set<ListNode> set=new HashSet<>();
        // while(head!=null)
        // {
        //     if(set.contains(head)) return true;
        //     set.add(head);
        //     head=head.next;
        // }
        // return false;

        //method 2
        //using floyd's algorithm
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
}
