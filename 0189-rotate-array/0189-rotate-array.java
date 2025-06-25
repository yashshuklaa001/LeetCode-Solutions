class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotateHelper(nums,0,n);
        rotateHelper(nums,0,k);
        rotateHelper(nums,k,n);
    }
    void rotateHelper(int[] nums,int start,int end){
        end--;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}