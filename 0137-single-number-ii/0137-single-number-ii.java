class Solution {
    public int singleNumber(int[] nums) {
        // int result=0;
        // for(int i=0;i<32;i++){
        //     int count=0;
        //     for(int num:nums){
        //         if((num>>i & 1) == 1){
        //             count++;
        //         }
        //     }
        //     if(count%3!=0){
        //         result=result|(1<<i);
        //     }
        // }
        // return result;
        int ones=0;
        int twos=0;
        for(int num:nums){
            ones= (ones ^ num) & ~twos;
            twos=(twos^num) & ~ones;
        }
        return ones;
    }
}