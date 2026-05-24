class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        // agar first lenge toh last nahi lenge
        int case1 = helper(nums, 0, n - 2);
        // agar last lenge toh first nahi lenge
        int case2 = helper(nums, 1, n - 1);
        return Math.max(case1, case2);
    }
    public int helper(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;
        for(int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}