/*
You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.
Note that the absolute difference between two integers x and y is defined as |x - y|.

Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
*/
//code
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int eSum=0, dSum=0;
        for(int i: nums) 
        {
            eSum+=i;
            while(i>0)
            {
                dSum+=i%10;
                i/=10;
            }
        }
        return Math.abs(eSum-dSum);
    }
}
