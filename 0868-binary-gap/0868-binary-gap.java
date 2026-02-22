class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int Gap = 0;
        int pos = 0;       
        while (n > 0) {
            if ((n & 1) == 1) {
                if (last != -1) {
                    Gap = Math.max(Gap, pos - last);
                }
                last = pos;
            }
            pos++;
            n >>= 1;
        }        
        return Gap;
    }
}