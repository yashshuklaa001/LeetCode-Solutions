class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEatAll(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += ((long)pile + k - 1) / k; // use long to prevent overflow
            if (totalHours > h) return false; // early exit optimization
        }
        return totalHours <= h;
    }

    private int getMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
