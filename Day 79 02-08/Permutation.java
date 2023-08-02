// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
// Example 1:
// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:
// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:
// Input: nums = [1]
// Output: [[1]]
// Constraints:
// 1 <= nums.length <= 6
// -10 <= nums[i] <= 10
// All the integers of nums are unique.
//code
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //backtracking
        List<List<Integer>> ans=new ArrayList<>();
        f(ans, nums,0);     
        return ans;
    }

    private void f(List<List<Integer>> ans, int[] nums, int indx)
    {
        if(indx==nums.length)
        {
            ans.add(asList(nums));
        }
        else
        {
            for(int i=indx;i<nums.length;i++)
            {
                swap(i, indx, nums);
                f(ans,nums,indx+1);     //recursion
                swap(i,indx, nums);
            }
        }
    }

    private List<Integer> asList(int[] nums)
    {
        List<Integer> list=new ArrayList<>();
        for(int i: nums)
        {
            list.add(i);
        }
        return list;
    }

    private void swap(int i, int j, int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
