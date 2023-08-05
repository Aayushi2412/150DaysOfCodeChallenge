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
    public List<TreeNode> generateTrees(int n) {
        //initialise a list of bst as empty
        //for every no. from 1 to n:
            //1.create a new node 'node' with key as 'i'.
            //2. recursively construct list of all left and right subtrees
        //iterate for all left subtrees
            //1.for current left subtree, iterate for all right subtrees
            //2. add current left and right subtree to node and add node to bst
        return generateSubtrees(1,n);
    }

    private List<TreeNode> generateSubtrees(int s, int e)
    {
        List<TreeNode> ans=new LinkedList<>();
        if(s>e)
        {
            ans.add(null);
            return ans;
        }
        for(int i=s;i<=e;i++)
        {
            List<TreeNode> left=generateSubtrees(s, i-1);
            List<TreeNode> right=generateSubtrees(i+1,e);

            for(TreeNode l: left)
            {
                for(TreeNode r: right)
                {
                    TreeNode root=new TreeNode(i);
                    root.left=l;
                    root.right=r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
