class Solution {
    public int maxProduct(int[] nums) {
        int maxp=nums[0];
        int minp=nums[0];
        int result=nums[0];
        int t;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                t=maxp;
                maxp=minp;
                minp=t;
            }
            maxp=Math.max(nums[i],maxp*nums[i]);
            minp=Math.min(nums[i],minp*nums[i]);
            result=Math.max(result,maxp);
        }
        return result;
    }
}