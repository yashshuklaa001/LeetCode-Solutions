class Solution {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int posLen = 0;
        int negLen = 0;
        for (int num : nums) {
            if (num == 0) {
                posLen = 0;
                negLen = 0;
            } else if (num > 0) {
                posLen += 1;
                negLen = (negLen == 0) ? 0 : negLen + 1;
            } else { // num < 0
                int temp = posLen;
                posLen = (negLen == 0) ? 0 : negLen + 1;
                negLen = temp + 1;
            }
            maxLen = Math.max(maxLen, posLen);
        }
        return maxLen;
    }
}
