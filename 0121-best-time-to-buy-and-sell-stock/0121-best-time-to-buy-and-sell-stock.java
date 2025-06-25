class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for(int i = 0;i<prices.length;i++){
        //     for(int j=0;j<prices.length;j++){
        //         if(prices[j]>prices[i]){
        //             int profit = prices[j]-prices[i];
        //             maxProfit = Math.max(profit,maxProfit);
        //         }
        //     }
        // }
        // return maxProfit;
    //     int maxProfit=0;
    //     for(int i=0;i<prices.length;i++){
    //         for(int j=i+1;j<prices.length;j++){
    //             if(prices[j]>prices[i]){
    //                 int profit = prices[j]-prices[i];
    //                 maxProfit = Math.max(profit,maxProfit);
    //             }
    //         }
    //     }
    //     return maxProfit;
    // }
    // int maxProfit=0;
    // int lowestPrice=prices[0];
    // for(int i=0;i<prices.length;i++){
    //     if(prices[i]<lowestPrice){
    //         lowestPrice=prices[i];
    //     }
    //     int profit=prices[i]-lowestPrice;
    //     maxProfit=Math.max(profit,maxProfit);
    // }
    // return maxProfit;
    int max=0;
    int lowPr=prices[0];
    for(int i=0;i<prices.length;i++){
        if(prices[i]<lowPr){
            lowPr=prices[i];
        }
        int profit = prices[i]-lowPr;
        max=Math.max(profit,max);
    }
    return max;
}
}