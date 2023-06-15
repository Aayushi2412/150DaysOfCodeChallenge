// Given the root of a binary tree, return all root-to-leaf paths in any order.
// A leaf is a node with no children.
//   Input: root = [1,2,3,null,5]
// Output: ["1->2->5","1->3"]
// Example 2:
// Input: root = [1]
// Output: ["1"]
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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null) return list;
        f(root,"", list);
        return list;
    }
    public void f(TreeNode root, String path,List<String> ans)
    {
        
        if(root.left==null && root.right==null) ans.add(path+root.val);
        if(root.left!=null) f(root.left,path+root.val+"->",ans);
        if(root.right!=null) f(root.right, path+root.val+"->",ans);
         
    }
}
 
