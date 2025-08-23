class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=getMin(bloomDay);
        int high=getMax(bloomDay);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int getMin(int []arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            min=Math.min(min,i);
        }
        return min;
    }
    public int getMax(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    public boolean possible(int arr[],int day,int m,int k){
        int count=0;
        int noOfB=0;
        for(int i:arr){
            if(i<=day){
                count++;
                if(count==k){
                    noOfB++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return noOfB>=m;
    }
}