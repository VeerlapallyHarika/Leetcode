class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long req=(long) m*k;
        if(req>bloomDay.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int day:bloomDay){
            low=Math.min(day,low);
            high=Math.max(day,high);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0,bouquets=0;
            for(int day:bloomDay){
                if(day<=mid){ count++;
                if(count==k){
                    bouquets++;
                    count=0;     
                }
            }
                else count=0;
             }
            if(bouquets>=m){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}