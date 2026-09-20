class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high=0;
        for(int pile:piles){
            high=Math.max(pile,high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            long hrs=0;
            for(int pile:piles){
                hrs+=(pile+mid-1)/mid;
            }
            if(hrs<=h) high=mid-1;
            else low=mid+1;            
        }
        return low;
    }
}