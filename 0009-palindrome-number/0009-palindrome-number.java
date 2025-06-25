class Solution {
    public boolean isPalindrome(int x) {
        int cpy = x;
        int sum=0;
        while(cpy!=0){
            int a=cpy%10;
            sum=(sum*10)+a;
            cpy=cpy/10;
        }
        if(x<0){
            return false;
        }
        else if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}