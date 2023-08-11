lass Solution {
    public int change(int amount, int[] coins) {
        
        //memoization
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return find(n-1,amount,dp,coins);
    }
    public int find(int indx,int t,int[][]dp, int[] arr)
    {
        //base case
        if(indx==0)
            return (t%arr[0]==0?1:0);
        if(dp[indx][t]!=-1) return dp[indx][t];

        int nottake= find(indx-1,t,dp,arr);
        int take=0;
        if(arr[indx]<=t) take= find(indx,t-arr[indx],dp,arr);
        return dp[indx][t]=take+nottake;
    }
