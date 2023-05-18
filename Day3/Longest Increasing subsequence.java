/*
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
*/
//code
class Solution {
    public int lengthOfLIS(int[] nums) {
        //recursion TC=O(2^n)
        int n=nums.length;
        int[][] dp=new int[n+1][n+1];
        for(int [] row: dp) Arrays.fill(row,-1);
        return f(0,-1,nums,dp);
    }
    public int f(int ind, int prev, int[] nums, int[][] dp)
    {
        //base case
        if(ind==nums.length) return 0;
        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
        //nottake
        int len1=0+f(ind+1, prev, nums,dp);
        //take
        int len=0;
        if(prev==-1 || nums[ind]>nums[prev] )
        len=1+f(ind+1, ind, nums,dp);
        return dp[ind][prev+1]= Math.max(len1, len);
    }
}
