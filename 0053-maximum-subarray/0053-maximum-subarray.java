class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            sum=Math.max(sum,nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
    // public int maxSubArray(int[] nums) {
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++){
    //             sum+=nums[j];
    //             max = Math.max(sum,max);
    //         }
    //     }
    //     return max;
    // }
}