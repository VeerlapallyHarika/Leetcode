class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int number=0;
        for(int num:nums){
            if(count==0){
                number=num;
            }
            if(num==number){
                count++;
            }
            else{
                count--;
            }
        }
        return number;
    }
}