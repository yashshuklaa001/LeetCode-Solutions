class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        double max = (double)sum/k;
        for(int i = k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,(double)sum/k);
        }
        return max;
    }
    // public double findMaxAverage(int[] nums, int k) {
    //     double max=Double.NEGATIVE_INFINITY;
    //     for(int i = 0;i<=nums.length-k;i++){
    //         int sum =0;
    //         for(int j=i;j<i+k;j++){
    //             sum+=nums[j];
    //         }
    //         max=Math.max(max,(double)sum/k);
    //     }
    //     return max;
    // }
}