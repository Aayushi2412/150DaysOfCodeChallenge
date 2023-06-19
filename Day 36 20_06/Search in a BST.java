//Given is an integer value 'val', return the node in the given BST whose value = val, else return null;
//Input: root = [4,2,7,1,3], val = 2
//Output: [2,1,3]
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
class Solution 
{
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(val==root.val) return root;
        if(val<root.val) return searchBST(root.left,val);
        else  return searchBST(root.right,val);
        
    }
}
