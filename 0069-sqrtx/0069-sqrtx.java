class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int low = 1;
        int high = x / 2;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == x) return mid;
            else if (square < x) {
                ans = mid;        // potential answer
                low = mid + 1;    // move right to find higher value
            } else {
                high = mid - 1;   // move left
            }
        }

        return ans;
    }
}
