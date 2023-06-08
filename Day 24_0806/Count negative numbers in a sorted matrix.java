/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0
*/
//code
class Solution {
    public int countNegatives(int[][] grid) {
        
        int r=0,c=grid[0].length-1,count=0;
        while(r<grid.length && c>=0)
        {
            if(grid[r][c]>=0)
                r++;
            else
            {
                c--;
                count+=grid.length-r;
            }
        }
        return count;
        
        /*
        int n =grid[0].length,m=grid.length;
        int count=0;
        int l=0,r=n-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            for(int i=0;i<m;i++)
            {
                if(grid[i][mid]>=0)
                    l=mid+1;
                else{
                    count+=n-mid;
                    r=mid-1;
                }
                    
            }
        }
        return count;
        */
        
    }
}
            
