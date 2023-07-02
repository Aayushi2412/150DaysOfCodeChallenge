// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
// 0 <= k <= 105

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        //brute force
        //tc=o(n^2), sc=o(1)
        //TLE
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k) return true;
        //     }
        // }
        // return false;
        //Optimised Approach // tc=O(n), sc=O(n)
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(Math.abs(i-map.get(nums[i]))<=k)return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
