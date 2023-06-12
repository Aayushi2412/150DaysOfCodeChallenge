/*
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
The path sum of a path is the sum of the node's values in the path.
Given the root of a binary tree, return the maximum path sum of any non-empty path.
*/
//code
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
    public int maxPathSum(TreeNode root) {
        int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;
        maxPathDown(root,max);
        return max[0];
    }
    public int maxPathDown(TreeNode root, int[] max)
    {
        if(root==null) return 0;
        int left=Math.max(0, maxPathDown(root.left, max));
        int right=Math.max(0, maxPathDown(root.right,max));
        max[0]=Math.max(max[0],left+right+root.val);
        return Math.max(left, right)+root.val;
    }
}
