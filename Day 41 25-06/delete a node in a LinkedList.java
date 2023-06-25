/*
There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
*/
//code
class Sol
  {
    public void deleteNode(ListNode head)
    {
      if(head.next==null)return;     //node is the last node in the given ll
      node.val=node.next.val;
      node.next=node.next.next;
    }
  }
