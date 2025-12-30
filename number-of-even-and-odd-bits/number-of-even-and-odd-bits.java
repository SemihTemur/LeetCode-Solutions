class Solution {
    public int[] evenOddBit(int n) {
        int index = 0;
        int[] evenOddbit = new int[2];
        
        while (n>0) {
            int bit = n & 1;
            if(bit==1)
                evenOddbit[index % 2]++;
            n >>=1;
            index++;
        }

        return evenOddbit;
    }
}