class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int majElement=0;
        for(int i:nums){
            if(count==0){
                majElement=i;
            }
            if(i==majElement){
                count++;
            }else{
                count--;
            }
        }
        return majElement;
    }
}