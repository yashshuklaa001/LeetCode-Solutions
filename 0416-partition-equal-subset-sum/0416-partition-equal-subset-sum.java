class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;

        // Compute total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // If total sum is odd, it's impossible to split into two equal subsets
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Base case: zero sum is always possible

        // Process each number in nums
        for (int num : nums) {
            for (int j = target; j >= num; j--) { // Traverse backwards
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    // Driver Code for Testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPartition(new int[]{1, 5, 11, 5})); // true
        System.out.println(solution.canPartition(new int[]{1, 2, 3, 5}));  // false
    }
}
