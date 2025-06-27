class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int []nums,int low,int high){
        int mid = (low+high)/2;
        if(low>=high){
            return;
        }
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public void merge(int []nums,int low,int mid,int high){
        List<Integer> result = new ArrayList<>();
        int left = low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(nums[left]<nums[right]){
                result.add(nums[left]);
                left++;
            }
            else{
                result.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            result.add(nums[left]);
            left++;
        }
        while(right<=high){
            result.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=result.get(i-low);
        }
    }
}