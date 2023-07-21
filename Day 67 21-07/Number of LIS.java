class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length, ans=0, max_len=0;
        int[] dp=new int[n], count=new int[n];

        for(int i=0;i<n;i++)
        {
            dp[i]= count[i]=1;       //set entire dp and count matrix to 1
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])   //increasing sequence
                {
                    if(dp[i]==dp[j]+1) count[i]+=count[j];
                    if(dp[i]<dp[j]+1)
                    {
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }
                }
            }
            if(max_len==dp[i]) ans+=count[i];
            if(max_len<dp[i])
            {
                max_len=dp[i];
                ans=count[i];
            }
        }
        return ans;
    }
}
