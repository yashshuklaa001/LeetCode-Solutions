import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Step 1: Sort the array

        long total = 0;
        int left = 0, maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // Calculate cost of making all elements in [left, right] equal to nums[right]
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++; // Shrink window
            }

            // Update max frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
