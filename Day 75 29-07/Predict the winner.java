class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int totalSum=0;
        for(int i: nums) totalSum+=i;      //total points sum
        int player1=f(nums, 0, nums.length-1);
        int player2=totalSum-player1;
        return player1>=player2;
    }

    private int f(int[] nums, int i, int j)
    {
        //base case
        if(i>j) return 0;

        //options available for player1
        int option1=nums[i]+Math.min(f(nums,i+2,j), f(nums,i+1,j-1));
        int option2=nums[j]+Math.min(f(nums,i+1,j-1), f(nums,i,j-2));
        return Math.max(option1, option2);
    }
}
