class Solution {
    //Bottom Up Approach
    public int fib(int n) {
        if(n<1){
            return n;
        }
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    //Top Down Approach
    //     HashMap<Integer,Integer> cache = new HashMap<>();
    // public int fib(int n) {
    //     if(n<=1){
    //         return n;
    //     }
    //     if(cache.containsKey(n)){
    //         return cache.get(n);
    //     }
    //     int result = fib(n-1)+fib(n-2);
    //     cache.put(n,result);
    //     return result;
    // }
}