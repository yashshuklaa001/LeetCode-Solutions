class Solution {
    public int removeDuplicates(int[] nums) {
        // int i =0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[j]!=nums[i]){
        //         nums[i+1]=nums[j];
        //         i++;
        //     }
        // }
        // return i+1;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}