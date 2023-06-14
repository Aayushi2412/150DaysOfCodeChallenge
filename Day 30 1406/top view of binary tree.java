import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/
class Pair{
	BinaryTreeNode node;
	int hd;
	Pair(BinaryTreeNode _node, int _hd)
	{
		node=_node;
		hd=_hd;
	}
}

public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		ArrayList<Integer> ans=new ArrayList<>();
		if(root==null) return ans;
		Map<Integer,Integer>map=new TreeMap<>();
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty())
		{
			Pair it=q.remove();
			int hd=it.hd;       //line
			BinaryTreeNode temp=it.node; //node
			if(map.get(hd)==null) map.put(hd,temp.val);
			if(temp.left!=null) q.add(new Pair(temp.left, hd-1));
			if(temp.right!=null) q.add(new Pair(temp.right, hd+1));
		}
		for(Map.Entry<Integer,Integer>e: map.entrySet())
			ans.add(e.getValue());
		return ans;
	}
}
