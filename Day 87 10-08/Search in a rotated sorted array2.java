class Solution {
    public boolean search(int[] nums, int target) {
        //binary search
        int l=0, r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target) return true;

            //if there are duplicates
            if(nums[l]==nums[mid] && nums[mid]==nums[r])
            {
                l++;
                r--;
            }
            //left half is sorted
            else if(nums[l]<=nums[mid])
            {
                if(target>=nums[l] && target<=nums[mid]) r=mid-1;
                else l=mid+1;
            }
            else
            {
                if(target<=nums[r] && target>=nums[mid]) l=mid+1;
                else r=mid-1;
            }  
        }
        return false;
    }
}
