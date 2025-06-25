class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = getSum(weights);
        while(low<high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canShip(int []weights,int D,int capacity){
        int days=1;
        int current=0;
        for(int weight :weights){
            if(current+weight>capacity){
                days++;
                current=0;
            }
            current+=weight;
        }
        return days<=D;
    }
    private int getMax(int []weights){
        int max=0;
        for(int i:weights){
            max=Math.max(max,i);
        }
        return max;
    }
    private int getSum(int []weights){
        int sum=0;
        for(int i:weights){
            sum+=i;
        }
        return sum;
    }
}