//Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
// Input: root = [1,2,3,null,5,null,4]
// Output: [1,3,4]
// Example 2:

// Input: root = [1,null,3]
// Output: [1,3]
// Example 3:

// Input: root = []
// Output: []
//code
class Sol
{
  public List<Integer> rightSideView(TreeNode root) 
  {
    List<Integer> ans=new ArrayList<>();
    right(root,ans,0);
    return ans;
  }
  public void right(TreeNode root, List<Integer> ans, int level)
  {
    if(root==null) return;
    if(level==ans.size()) ans.add(root.val);
    right(root.right,ans,level+1);
    right(root.left,ans,level+1);
  }
}
