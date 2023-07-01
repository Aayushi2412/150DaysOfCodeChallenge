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
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null) return 0;
        return f(root,targetSum)+ pathSum(root.left, targetSum)+ pathSum(root.right,targetSum);
    }
    public int f(TreeNode root, long target)
    {
        if(root==null) return 0;
        return(target-root.val==0?1:0)+f(root.left,target-root.val)+f(root.right,target-root.val);
    }
}
