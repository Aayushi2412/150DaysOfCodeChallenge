/*
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //creating arraylist to store the inorder traversal of the bst as it is always sorted
        ArrayList<Integer> arr=new ArrayList<>();
        Inorder(root,arr);
        return arr.get(k-1);
    }
    public void Inorder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
    }
}
