public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int lastBit=n&1;
            result= result<<1 | lastBit;
            n=n>>>1;
        }
        return result;
    }
}