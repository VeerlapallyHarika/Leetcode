class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int[] value = new int[256];
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;
        
        for(int i=0;i<s.length();i++){
            int curr=value[s.charAt(i)];
            if(i+1<s.length() && curr<value[s.charAt(i+1)]){
                ans-=curr;
            }
            else ans+=curr;
        }
        return ans;
    }
}