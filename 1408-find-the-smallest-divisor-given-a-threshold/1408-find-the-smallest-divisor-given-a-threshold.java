class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=getMax(nums);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums,mid,threshold)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int getMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(i,max);
        }
        return max;
    }
    public boolean possible(int arr[],int div,int thres){
        int count=0;
        for(int i:arr){
            count+=Math.ceil((double)i/(double)div);
        }
        return count<=thres;
    }
}