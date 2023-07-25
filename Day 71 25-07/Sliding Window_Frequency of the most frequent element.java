class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0, max=1, sum=0;
        Arrays.sort(nums);
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];      //sum of all elements in the window

            while(nums[r]*(r-l+1)-sum>k)   //r-l+1 is the window size
            {
                sum-=nums[l];
                l++;
            }
            max=Math.max(max, r-l+1);
        }
        return max;
    }
}
