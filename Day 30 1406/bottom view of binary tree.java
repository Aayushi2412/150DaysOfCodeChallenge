import java.util.* ;
import java.io.*; 
/*********************************************

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

*********************************************/
class Pair
{
    int hd;
    BinaryTreeNode node;
    Pair(int hd, BinaryTreeNode node)
    {
        this.hd=hd;
        this.node=node;
    }
}
public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         // Write your code here.       
         ArrayList<Integer> ans=new ArrayList<>();
         if(root==null) return ans;
         Map<Integer,Integer> map=new TreeMap<>();
         Queue<Pair> q=new LinkedList<>();
         q.add(new Pair(0,root));
         while(!q.isEmpty())
         {
             Pair it=q.remove();
             int hd=it.hd;
             BinaryTreeNode temp=it.node;
             map.put(hd,temp.val);
             if(temp.left!=null)
             {
                 q.add(new Pair(hd-1, temp.left));
             }
             if(temp.right!=null)
             {
                 q.add(new Pair(hd+1, temp.right));
             }
         } 
         for(Map.Entry<Integer,Integer> e:map.entrySet())
            ans.add(e.getValue());
        return ans; 
    }
}
