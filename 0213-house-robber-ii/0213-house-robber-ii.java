class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] skip_last = new int[n - 1];
        int[] skip_first = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            skip_last[i] = nums[i];
            skip_first[i] = nums[i + 1];
        }
        int amount1 = helper(skip_last);
        int amount2 = helper(skip_first);
        return Math.max(amount1, amount2);
    }
    public int helper(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}