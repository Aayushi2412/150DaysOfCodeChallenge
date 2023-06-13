//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
// Input: root = [1,2,2,3,4,4,3]
// Output: true
// Input: root = [1,2,2,null,3,null,3]
// Output: false
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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2)
    {
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        else
        {
            return t1.val==t2.val && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
        }
    }
}
