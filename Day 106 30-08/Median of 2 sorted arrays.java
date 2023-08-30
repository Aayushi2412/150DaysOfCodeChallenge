class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //approach : 
            //form a 3rd array by merging nums1 and nums2 in a sorted order
            //length of the array= length(nums1+nums2)
            //i=0 for nums1 and j=0 for nums2
            //if(nums1[i]<nums2[j], add nums1[i] to arr3 and i++)
            //else add nums2[j] to arr3 and j++
            //if len(arr3) is odd, median = element at len(arr3)/2 index
            //else median= avg(len(arr3)/2 and len(arr3)/2-1)th indices
        //code
        
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int[] arr=new int[n];
        int i=0,j=0, k=0;

        while(i<=n1 && j<=n2)
        {
            if(i==n1)
            {
                while(j<n2) arr[k++]=nums2[j++];
                break;
            }
            else if(j==n2)
            {
                while(i<n1) arr[k++]=nums1[i++];
                break;
            }
            if(nums1[i]<nums2[j]) arr[k++]=nums1[i++];
            else arr[k++]=nums2[j++];
        }
        if(n%2==0) return (float)(arr[n/2-1]+arr[n/2])/2;
        else return arr[n/2];
    }
}
