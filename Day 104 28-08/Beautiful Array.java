// An array nums of length n is beautiful if:

// nums is a permutation of the integers in the range [1, n].
// For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums[k] == nums[i] + nums[j].
// Given the integer n, return any beautiful array nums of length n. There will be at least one valid answer for the given n.

 

// Example 1:

// Input: n = 4
// Output: [2,1,4,3]
// Example 2:

// Input: n = 5
// Output: [3,1,2,5,4]
//code
class Solution {
    public int[] beautifulArray(int n) {
        int[] ans=new int[n];
        if(n==1) return new int[]{1};
        else if(n==2) return new int[]{1,2};
        else
        {
            int[] odd=beautifulArray(n+1)/2;
            int[] even=beautifulArray(n/2);
            for(int i=0;i<odd.length;i++)
                ans[i]=odd[i]*2-1;
            for(int j=0;j<even.length;j++)
                ans[odd.length+j]=even[j]*2;
        }
        return ans;
    }
}
