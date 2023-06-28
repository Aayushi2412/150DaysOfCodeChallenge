class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        //storing the triangle
        for(int row=1;row<=numRows;row++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int col=1;col<=row;col++)
            {
                temp.add(ncr(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;        
    }
    public int ncr(int n, int r)
    {
        long res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }
}
