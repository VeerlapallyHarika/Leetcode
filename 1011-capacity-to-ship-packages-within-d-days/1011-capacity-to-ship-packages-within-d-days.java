class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int currentweight=0;
            int daysneeded=1;
            for(int weight:weights){
                if(currentweight+weight>mid){
                    daysneeded++;
                    currentweight=weight;
                }
                else {
                    currentweight+=weight;
                }
            }
            if(daysneeded<=days) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}