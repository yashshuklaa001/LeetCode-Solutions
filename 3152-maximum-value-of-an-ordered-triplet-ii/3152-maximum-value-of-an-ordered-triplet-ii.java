class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; // Edge case: If there are less than 3 elements

        // Step 1: Compute prefix max array (maxLeft)
        int[] maxLeft = new int[n];
        maxLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }

        // Step 2: Compute suffix max array (maxRight)
        int[] maxRight = new int[n];
        maxRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        }

        // Step 3: Iterate through j and find the max triplet value
        long maxValue = 0; // Use long to prevent integer overflow
        for (int j = 1; j < n - 1; j++) {
            long leftMax = maxLeft[j - 1];  // max nums[i] where i < j
            long rightMax = maxRight[j + 1];  // max nums[k] where k > j
            long tripletValue = (leftMax - nums[j]) * rightMax;
            maxValue = Math.max(maxValue, tripletValue);
        }

        return maxValue;
    }
}
