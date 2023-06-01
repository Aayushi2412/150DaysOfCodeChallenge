/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
//code
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force   tc=O(n^2)
        /*
        int[] indx=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    indx[0]=i;
                    indx[1]=j;
                } 
            }
        }
        return indx;
        */
        //Using HashMap  tc=O(n),,,, n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                ans[0]=map.get(nums[i]);
                ans[1]=i;
                break;
            }
            else
                map.put((target-nums[i]),i);
        }
        return ans;
        
    }
}
