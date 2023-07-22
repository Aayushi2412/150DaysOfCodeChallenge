/*
On an n x n chessboard, a knight starts at the cell (row, column) and attempts to make exactly k moves. The rows and columns are 0-indexed, so the top-left cell is (0, 0), and the bottom-right cell is (n - 1, n - 1).
A chess knight has eight possible moves it can make, as illustrated below. Each move is two cells in a cardinal direction, then one cell in an orthogonal direction.
Each time the knight is to move, it chooses one of eight possible moves uniformly at random (even if the piece would go off the chessboard) and moves there.
The knight continues moving until it has made exactly k moves or has moved off the chessboard.
Return the probability that the knight remains on the board after it has stopped moving.
Example 1:
Input: n = 3, k = 2, row = 0, column = 0
Output: 0.06250
Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
From each of those positions, there are also two moves that will keep the knight on the board.
The total probability the knight stays on the board is 0.0625.
Example 2:
Input: n = 1, k = 0, row = 0, column = 0
Output: 1.00000
Constraints:
1 <= n <= 25
0 <= k <= 100
0 <= row, column <= n - 1
*/
//code
class Solution {
    //recurisve approach  TLE
    // private int[][] dir={{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}};
    // public double knightProbability(int n, int k, int row, int col) {
    //     return find(n,k,row,col);
    // }

    // private boolean isValid(int n, int r, int c)
    // {
    //     if(r<0 || r>=n || c<0 || c>=n) return false;    //base case
    //     return true;
    // }

    // private double find(int n, int k, int r, int c)
    // {
    //     if(isValid(n,r, c)==false) return 0;
    //     if(k==0) return 1;
    //     double prob=0;
    //     for(int i=0;i<dir.length;i++)
    //     {
    //         prob+=find(n, k-1, r+dir[i][0], c+dir[i][1])/8.0;
    //     }
    //     return prob;
    // }

    //Dynamic Programming 
    //Memoization

    private int[][] dir={{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}};
    private double[][][] dp;
    public double knightProbability(int n, int k, int row, int col) {
        dp=new double[n][n][k+1];
        return find(n,k,row,col);
    }

    private double find(int n, int k, int r, int c)
    {
        if(r<0 || r>n-1 || c<0 || c>n-1) return 0;    //base case
        if(k==0) return 1;                           //base case
        if(dp[r][c][k]!=0) return dp[r][c][k];      //base case
        double prob=0;
        for(int i=0;i<dir.length;i++)
        {
            prob+=find(n,k-1, r+dir[i][0], c+dir[i][1])/8.0;
        }
        dp[r][c][k]=prob;
        return prob;
    }
}
