class Solution {
    public int findClosestNumber(int[] nums) {
        //find the distance of every number form '0' & determine the closest
        int ans=Integer.MAX_VALUE;
        for(int i: nums)
        {
            if(Math.abs(i)<Math.abs(ans) || i==Math.abs(ans))
                ans=i;
        }
        return ans;
    }
}
