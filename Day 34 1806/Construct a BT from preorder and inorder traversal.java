/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree,
construct and return the binary tree.
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        TreeNode root=buildTree(preorder,0,preorder.length-1, inorder,0, inorder.length-1,map);
        return root;
    }
    public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd, Map<Integer,Integer> map)
    {
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root=new TreeNode(pre[preStart]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left=buildTree(pre,preStart+1,preStart+numsLeft,in,inStart,inRoot-1, map);
        root.right=buildTree(pre,preStart+numsLeft+1,preEnd,in,inRoot+1,inEnd, map);
        return root;

    }
}
