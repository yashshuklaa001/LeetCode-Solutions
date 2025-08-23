class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int low=getMax(weights);
         int high=getTotal(weights);
         int ans=0;
         while(low<=high){
            int mid=(low+high)/2;
            if(possible(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
         }
         return ans;
    }
    public int getMax(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    public int getTotal(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public boolean possible(int weights[],int day,int days){
        int requiredDays = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > day) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
            return requiredDays <= days;
        }
}