// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
//code
class Solution {
    public int longestOnes(int[] nums, int k) {
        //sliding window
        //2-pointer approach
        //TLE
        // int left=0, right=0;
        // int zeroCount=0;
        // int maxLength=0;
        // while(right<nums.length)
        // {
        //     if(nums[right]==0) zeroCount++;
        //     while(zeroCount > k)
        //     {
        //         if(nums[left]==0) zeroCount--;
        //         left++;
        //     }
        //     maxLength=Math.max(maxLength, right-left+1);
        // }
        // return maxLength;

        int i=0, j=0;
        while(i<nums.length)
        {
            if(nums[i]==0) k--;
            if(k<0)
            {
                if(nums[j]==0) k++;
                j++;  //move the sliding window
            }
            i++;
        }
        return i-j;
    }
}
