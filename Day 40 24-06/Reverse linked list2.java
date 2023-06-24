/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, 
and return the reversed list.
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //base case
        if(head==null || left==right) return head;
        List<Integer> list=new LinkedList<>();
        f(head,list,left,right,0);
        return head;

    }
    public void f(ListNode head, List<Integer> list, int l, int r, int cur)
    {
        if(head==null) return;
        cur++;
        if(cur>=l && cur<=r) list.add(head.val);
        if(cur>r) return;
        f(head.next,list,l,r,cur);
        if(cur>=l && cur<=r)
        {
            head.val=list.get(0);
            list.remove(0);
        }
    }
}
