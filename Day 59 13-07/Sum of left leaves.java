/*
Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:
Input: root = [1]
Output: 0
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;        //base case
        int ans=0;
        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null) ans+=root.left.val;    //if left subtree has no children
            else ans+=sumOfLeftLeaves(root.left);
        }
        ans+=sumOfLeftLeaves(root.right);
        return ans;
    }
}
