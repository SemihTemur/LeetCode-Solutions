class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0,doubleDigitSum = 0;

        for(int i:nums){
            if(i<10){
                singleDigitSum  = singleDigitSum + i;
            }
            else if(i<100){
                doubleDigitSum = doubleDigitSum + i;
            }
        }

        return singleDigitSum!=doubleDigitSum;

    }
}