class Solution {
    public int maxProfit(int k, int[] prices) {
        int dp[]= new int[2*k];
        for(int i=0;i<2*k;i+=2){
            dp[i]=Integer.MIN_VALUE;
        }
        for(int price:prices){
            for(int i=0;i<2*k;i++){
                if(i==0){
                    dp[i]=Math.max(dp[i],-price);
                }
                else if(i%2==0){
                    dp[i]=Math.max(dp[i],dp[i-1]-price);
                }
                else{
                     dp[i]=Math.max(dp[i],dp[i-1]+price);
                }
            }
        }
        return dp[2*k-1];
    }
}