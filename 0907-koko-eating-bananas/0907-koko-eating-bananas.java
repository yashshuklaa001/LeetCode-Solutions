class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=getMax(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(canEatAll(piles,mid)<=h){
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
    public int canEatAll(int []arr,int h){
        int total=0;
        for(int i:arr){
            total+=Math.ceil((double)i/(double)h);
        }
        return total;
    }
}