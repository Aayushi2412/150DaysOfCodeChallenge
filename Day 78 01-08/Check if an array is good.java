class Solution {
    public boolean isGood(int[] nums) {
        //good array of n:3=[1,2,3,3],
        //n:5=[1,2,3,4,5,5]
        int n=nums[0];
        for(int num: nums)    
        {
            if(num>n) n=num;                  //max element
        }
        //n=max element
        int[] freq=new int[n+1];             //to count the freq of each element
        for(int num:nums)   freq[num]+=1;
        if(freq[n]!=2) return false;         //if n doesnot occur twice in the array
        for(int i=1;i<n;i++)
        {
            if(freq[i]!=1) return false;   //rest elements occur only once
        }
        return true;
    }
}
