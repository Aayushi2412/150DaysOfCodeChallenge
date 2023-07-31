class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        //Variation of LCS(longest common substring)
        int n=s1.length(), m=s2.length(), sum1=0, sum2=0;
        //sum of ASCII values of all characters in s1 and s2
        for(int i=0;i<n;i++) sum1+=s1.charAt(i);
        for(int i=0;i<m;i++) sum2+=s2.charAt(i);
        int[][] dp=new int[n+1][m+1];

        //base case
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                    dp[i][j]=0;
            }
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=s1.charAt(i-1)+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return sum1+sum2-2*dp[n][m];

    }
}
