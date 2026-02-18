class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n&1;
        for(n=n>>1;n>0;n=n>>1){
            int cur=n&1;
            if(prev==cur){
                return false;
            }
            prev=cur;
        }
        return true;
    }
}