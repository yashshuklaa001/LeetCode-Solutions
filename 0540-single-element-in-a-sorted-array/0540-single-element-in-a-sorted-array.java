class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int low = 0, high = nums.length - 2; // NOTE: high = n - 2

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     // Check if mid is even or odd and compare with its pair
        //     if (nums[mid] == nums[mid ^ 1]) {
        //         low = mid + 1;
        //     } else {
        //         high = mid - 1;
        //     }
        // }

        // return nums[low];
        int r=0;
        for(int i:nums){
            r^=i;
        }
        return r;
    }
}
