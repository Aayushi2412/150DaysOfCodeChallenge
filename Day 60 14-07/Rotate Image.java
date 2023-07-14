class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        // step 1: transpose the matrix
        for(int i=0;i<n;i++)      //row
        {
            for(int j=i;j<n;j++)  //col
            {
                int temp=matrix[i][j];                      // 1 4 7
                matrix[i][j]=matrix[j][i];                 //  2 5 8
                matrix[j][i]=temp;                        //   3 6 9
            }
        }

        //step 2: reverse each row
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}
