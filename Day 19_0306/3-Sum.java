/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
*/
//code
class Solution {
    //List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        brute force   //tc=O(n^3)
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
           {
               for(int k=0;k<n;k++)
               {
                   if(nums[i]+nums[j]+nums[k]==0)
                   {
                       set.add(i);
                       set.add(j);
                       set.add(k);
                   }
               }
           }
        }
        */
        
        
        //2-pointer approach  tc=O(n^2)
       Arrays.sort(nums);
       List<List<Integer>> ans=new LinkedList<>();
       for(int i=0;i<nums.length-2;i++)
       {
           if(i==0 ||(i>0 && nums[i]!=nums[i-1]))
              {
                  int l=i+1,h=nums.length-1,sum=0-nums[i];
                  while(l<h)
                  {
                      if(nums[l]+nums[h]==sum)
                      {
                          ans.add(Arrays.asList(nums[i],nums[l],nums[h]));
                          while(l<h && nums[l]==nums[l+1])l++;
                          while(l<h && nums[h]==nums[h-1])h--;
                          l++; h--;
                      }
                      else if(nums[l]+nums[h]<sum)l++;
                      else h--;
                  }
              }
       }
       return ans;
    }
}
