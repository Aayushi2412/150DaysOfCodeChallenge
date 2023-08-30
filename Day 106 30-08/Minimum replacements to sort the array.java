class Solution {
    public long minimumReplacement(int[] nums) {
        //to sort the array in ascending order
        int n=nums.length;
        long count=0;
        int last=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>last)
            {
                //replacement
                int t=nums[i]/last;   //no.of times division needed
                if(nums[i]%last !=0) t++;
                last=nums[i]/t;
                count+=t-1;
            }
            else last=nums[i];
        }
        return count;

    }
}
