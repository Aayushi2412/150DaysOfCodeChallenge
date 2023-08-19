class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        Collections.sort(nums);  // Step 1
        int n = nums.size();
        int count = 0;

        int l = 0;
        int r = n - 1;

        while (l < r) {  // Step 4
            if (nums.get(l) + nums.get(r) < target) {
                count += r - l;
                l++;
            } else {
                r--;
            }
        }

        return count;
        
    }
}
