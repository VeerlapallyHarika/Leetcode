class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int mnc=prices[0];
        for(int i=1;i<prices.length;i++){
            maxp=Math.max(maxp,prices[i]-mnc);
            mnc=Math.min(mnc,prices[i]);
        }
        return maxp;
    }
}