class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int curGcd=nums[i];
            if(curGcd==k) ans++;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<k) break;
                curGcd=gcd(nums[j], curGcd);
                if(curGcd==k) ans++;
            }
        }
        return ans;
    
    }
    private int gcd(int a, int b)
    {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
