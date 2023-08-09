class Solution {
    public int minimizeMax(int[] nums, int p) {
        //p pairs of indices of nums such that the max diff b/w all pairs is minimised
         Arrays.sort(nums);
         int n=nums.length;
         int l=0, r=nums[n-1]-nums[0];
         while(l<r)
         {
             int mid=(l+r)/2, k=0;;
             for(int i=1;i<n && k<p;i++)
             {
                 if(nums[i]-nums[i-1]<=mid)
                 {
                     k++;
                     i++;
                 }
             }
             if(k>=p) r=mid;
             else l=mid+1;
         }
         return l;

    }
}
