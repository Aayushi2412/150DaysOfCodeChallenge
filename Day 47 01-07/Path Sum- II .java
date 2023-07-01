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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        f(root, targetSum, ans, new ArrayList());
        return ans;
    }
    public void f(TreeNode root, int sum,List<List<Integer>>ans, List<Integer> path)
    {
        if(root==null) return;
        path.add(root.val);
        if(root.left==null && root.right==null && sum==root.val) ans.add(path);
        f(root.left, sum-root.val,ans, new ArrayList(path)); 
        f(root.right, sum-root.val,ans, new ArrayList(path)); 
        
    }
}
