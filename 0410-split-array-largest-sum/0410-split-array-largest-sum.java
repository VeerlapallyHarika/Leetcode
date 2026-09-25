class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n) return -1;
        long low=0, high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canallocate(nums,k,mid)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)low;
    }
    static boolean canallocate(int nums[],int k,long maxsum){
        int count=1;
        long sum=0;
        for(int num:nums){
            if(num+sum<=maxsum){
                sum+=num;
            }
            else{
                count++;
                sum=num;
            }
        }
        return count <= k;
    }
}