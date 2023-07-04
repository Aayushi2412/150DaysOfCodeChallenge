// Input: word1 = "horse", word2 = "ros"
// Output: 3
// Explanation: 
// horse -> rorse (replace 'h' with 'r')
// rorse -> rose (remove 'r')
// rose -> ros (remove 'e')
//code
class Solution {
    public int minDistance(String word1, String word2) {
        /*
        //recursion //TLE
        //memoization 
        //tc=O(m*n)
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n][m];
        for(int[] row: dp) Arrays.fill(row,-1);
        return f(n-1, m-1,word1, word2,dp);
    }
    private int f(int i, int j, String s1, String s2, int[][] dp)
    {
        //base cases
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]= f(i-1,j-1, s1,s2,dp);
        return dp[i][j]=1+ Math.min(f(i-1, j, s1,s2,dp), Math.min(f(i,j-1,s1,s2,dp), f(i-1, j-1, s1,s2,dp)));
    }
    */

    //Tabulation
    int [][] dp=new int [word1.length()+1][word2.length()+1];
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                if (i==0){
                    dp[i][j]=j;

                }else if (j==0){
                    dp[i][j]=i;

                }else {
                    if (word1.charAt(i-1)==word2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else {
                        int val=Math.min(dp[i-1][j],dp[i][j-1]);
                        dp[i][j]=Math.min(val,dp[i-1][j-1])+1;

                    }
                    

                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
