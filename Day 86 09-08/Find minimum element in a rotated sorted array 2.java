class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        if(nums[l]<nums[r]) return nums[l];        //because the array was never rotated or is rotated n times
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]<nums[r]) r=mid;          // because min element is in the left half of the array
            else if(nums[mid]>nums[r]) l=mid+1;   //min element is in the right half of the array nums
            else r--;                            // to deal with duplicate values
        }
        return nums[r];
    }

}
