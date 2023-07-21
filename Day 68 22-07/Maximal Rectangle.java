/*
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.
Example 2:

Input: matrix = [["0"]]
Output: 0
Example 3:

Input: matrix = [["1"]]
Output: 1
*/
//code
class Solution {
    public int maximalRectangle(char[][] mat) {
        int n=mat.length;
        if(mat==null || n==0) return 0;
        int[] height=new int[mat[0].length];      //to store the heights of histograms from each row
        for(int i=0;i<mat[0].length;i++)
        {
            if(mat[0][i]=='1') height[i]=1;    //for the first row, mark all the 1's in the height array
        }
        int result=largestInLine(height);
        for(int i=1;i<n;i++)
        {
            resetHeight(mat,height, i);
            result=Math.max(result, largestInLine(height));
        }

        return result;  
    }

    private void resetHeight(char[][] mat, int[] height, int indx)
    {
        for(int i=0;i<mat[0].length;i++)
        {
            if(mat[indx][i]=='1') height[i]+=1;
            else height[i]=0;
        }
    }
    
    private int largestInLine(int[] height)
    {
        if(height==null || height.length==0) return 0;    //base case
        int n=height.length;
        Stack<Integer> s=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=n;i++)
        {
            int h=(i==n? 0:height[i]);
            if(s.isEmpty() || h>=height[s.peek()]) s.push(i);
            else
            {
                int tp=s.pop();
                maxArea=Math.max(maxArea, height[tp]*(s.isEmpty()? i:i-1-s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
