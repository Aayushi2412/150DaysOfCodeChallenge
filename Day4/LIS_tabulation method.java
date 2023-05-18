// return the longest increasing subsequence using tabulation method.
import java.util.*;
public class Solution {

	public static int longestIncreasingSubsequence(int arr[]) {
		//Your code goes here
		int n=arr.length;
		int[][] dp=new int[n+1][n+1];
    	for(int ind=n-1;ind>=0;ind--)
    	{
        	for(int prev=ind-1;prev>=-1;prev--)
        	{
            	//not take
            	int len=0+ dp[ind+1][prev+1];
				//take
           	 	if(prev==-1 || arr[ind]>arr[prev])
            		len=Math.max(len, 1+ dp[ind+1][ind+1]);
            	dp[ind][prev+1]=len;
			}
			
        }
        return dp[0][-1+1];
    

}

}
