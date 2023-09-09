class Solution {
    private int[] dp;
    public int combinationSum4(int[] nums, int target) {
        //tle //recursive
        // if(target==0) return 1;
        // int ans=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(target>=nums[i])
        //         ans+=combinationSum4(nums,target-nums[i]);
        // }
        // return ans;

        //memoization
        dp=new int[target+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        return f(nums,target);
    }
    private int f(int[] nums, int tar)
    {
        if(dp[tar]!=-1) return dp[tar];
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(tar>=nums[i])
                ans+=f(nums,tar-nums[i]);
        }
        dp[tar]=ans;
        return ans;
    }
}
