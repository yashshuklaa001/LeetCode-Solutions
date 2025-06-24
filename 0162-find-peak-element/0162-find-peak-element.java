class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;

        // if (n == 1) return 0; // Single element is peak

        // // Check first element
        // if (nums[0] > nums[1]) return 0;

        // // Check last element
        // if (nums[n - 1] > nums[n - 2]) return n - 1;

        // // Check middle elements
        // for (int i = 1; i < n - 1; i++) {
        //     if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
        //         return i;
        //     }
        // }

        // // Fallback (should never happen if input has at least one peak)
        // return -1;
        int left=0;
        int right = nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
