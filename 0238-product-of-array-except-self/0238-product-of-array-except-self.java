class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        result[0]=1;
        for(int i=1;i<result.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int right=1;
        for(int i = nums.length-1;i>=0;i--){
            result[i]=result[i]*right;
            right*=nums[i];
        }
        return result;
    }
    // public int[] productExceptSelf(int[] nums) {
    //     int left[] = new int[nums.length];
    //     int right[] = new int[nums.length];
    //     int result[] = new int[nums.length];
    //     left[0]=1;
    //     for(int i=1;i<left.length;i++){
    //         left[i]=left[i-1]*nums[i-1];
    //     }
    //     right[right.length-1]=1;
    //     for(int i = right.length-2;i>=0;i--){
    //         right[i]=right[i+1]*nums[i+1];
    //     }
    //     for(int i=0;i<result.length;i++){
    //         result[i]=left[i]*right[i];
    //     }
    //     return result;
    // }
    // public int[] productExceptSelf(int[] nums) {
    //     int result[]=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int product =1;
    //         for(int j=0;j<nums.length;j++){
    //             if(i!=j){
    //                 product*=nums[j];
    //             }
    //         }
    //         result[i]=product;
    //     }
    //     return result;
    // }
}