class Solution {
    public int longestSubarray(int[] nums) {
        //2-pointer sliding window approach
        int n=nums.length;
        int l=0, zero=0,ans=0;
        for(int r=0;r<n;r++)
        {
            if(nums[r]==0)zero++;
            while(zero>1)
            {
                if(nums[l]==0)zero--;
                l++;
            }
            ans=Math.max(ans,r-l+1-zero);
        }
        return (ans==n)?ans-1:ans;
              

    }
}
