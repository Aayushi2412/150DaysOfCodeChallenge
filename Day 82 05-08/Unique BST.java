class Solution {
    public int numTrees(int n) {
        //1 to n, construct a bst out of the sequence     1,2,3,4,5,6,...
        int[] g=new int[n+1];
        g[0]=g[1]=1;

        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                g[i]+=g[j-1]*g[i-j];
            }
        }
        return g[n];
    }
}
