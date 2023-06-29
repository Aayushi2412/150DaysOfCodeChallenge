/*
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> set1=new ArrayList<>();
        List<Integer> set2=new ArrayList<>();
        getLeafNodes(root1,set1);
        getLeafNodes(root2,set2);
        return set1.equals(set2);
    }
    public void getLeafNodes(TreeNode root, List<Integer> set)
    {
        if(root==null) return;
        getLeafNodes(root.left,set);
        if(root.left==null && root.right==null)
        {
            if(set==null) set=new ArrayList<Integer>();
            set.add(root.val);
            return;
        }
        getLeafNodes(root.right,set);
    }
}
