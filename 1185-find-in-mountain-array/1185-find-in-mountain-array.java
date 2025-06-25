/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // 1. Find peak index
        int peak = findPeak(mountainArr, n);

        // 2. Binary search in increasing part [0...peak]
        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;

        // 3. Binary search in decreasing part [peak+1...n-1]
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeak(MountainArray arr, int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int binarySearch(MountainArray arr, int target, int low, int high, boolean asc) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;

            if (asc) {
                if (val < target) low = mid + 1;
                else high = mid - 1;
            } else {
                if (val < target) high = mid - 1;
                else low = mid + 1;
            }
        }
        return -1;
    }
}
