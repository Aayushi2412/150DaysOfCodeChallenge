class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0) return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0,r=matrix.length*col-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int s=mid/col;
            int e=mid%col;
            if(target==matrix[s][e]) return true;
            if(target<matrix[s][e]) r=mid-1;
            else l=mid+1;
        }
        return false;
    }
}
