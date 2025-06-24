class Solution {
    private int getFirst(int []a,int target){
        int low=0;
        int high=a.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                first=mid;
                high=mid-1;
            }else if(a[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    private int getLast(int []a,int target){
        int low=0;
        int high=a.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                last=mid;
                low=mid+1;
            }else if(a[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=getFirst(nums,target);
        int last=getLast(nums,target);
        return new int[]{first,last};
    }
}