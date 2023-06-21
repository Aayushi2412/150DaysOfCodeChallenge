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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE, new int[]{0});
    }
    public TreeNode bstFromPreorder(int[] pre, int bound, int[] i)
    {
        if(i[0]==pre.length || pre[i[0]]>bound) return null;
        TreeNode root=new TreeNode(pre[i[0]++]);
        root.left=bstFromPreorder(pre,root.val,i);
        root.right=bstFromPreorder(pre,bound,i);
        return root;
    }
}
