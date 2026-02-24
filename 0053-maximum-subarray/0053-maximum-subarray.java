class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int s=nums[0];
        for(int i = 1; i < nums.length; i++){
            s = Math.max(nums[i], s + nums[i]); 
            max=Math.max(max,s);
            if(s<0){
                s=0;
            }
        }
        return max;
    }
}