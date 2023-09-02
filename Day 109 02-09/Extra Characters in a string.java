class Solution {
    public int minExtraChar(String s, String[] dictionary) 
    {
        int n = s.length();
        int[] dp = new int[n + 1]; // dp[i] represents the minimum number of extra characters if we break s[0...i-1] optimally

        dp[0] = 0; // Base case

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // Initialize with the maximum possible value
            
            for (int j = i - 1; j >= 0; j--) {
                String substring = s.substring(j, i);
                if (contains(dictionary, substring)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }

        return dp[n];
    
    }
    private static boolean contains(String[] dictionary, String word) {
        for (String entry : dictionary) {
            if (entry.equals(word)) {
                return true;
            }
        }
        return false;
    }
    
}
