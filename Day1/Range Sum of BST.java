/*
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
*/
//Code
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
    private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root==null) return 0;
        if(root.val>=low && root.val<=high) sum+=root.val;
        if(root.val>low) rangeSumBST(root.left,low,high);
        if(root.val<high) rangeSumBST(root.right,low,high);
        return sum;
    }
}
