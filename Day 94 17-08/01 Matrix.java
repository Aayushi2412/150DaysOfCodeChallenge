class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        //base case
        if(mat==null || m==0 || n==0)return mat;
        if(m==1 && n==1) return mat;
        int[][] ans=new int[m][n];
        int maxDistance=m+n;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0) continue;
                ans[i][j]=maxDistance;
                if(i>0) ans[i][j]=Math.min(ans[i][j], ans[i-1][j]+1);
                if(j>0) ans[i][j]=Math.min(ans[i][j], ans[i][j-1]+1);
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(mat[i][j]==0) continue;
                if(i<m-1) ans[i][j]=Math.min(ans[i][j], ans[i+1][j]+1);
                if(j<n-1) ans[i][j]=Math.min(ans[i][j], ans[i][j+1]+1);
            }
        }
        return ans;

    }
}
