// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
//code
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0) return 0;
        int min=nums[0];
        int max=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]<0)     //negative number
            {
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i], nums[i]*min);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
