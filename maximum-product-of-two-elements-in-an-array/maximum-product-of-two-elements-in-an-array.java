class Solution {
    public int maxProduct(int[] nums) {
        int maxValue = 0;
        int i = 0,index = 0;

        for(int num:nums){
            if(maxValue<num){
                maxValue = num-1;
                index = i;
            }
            i++;
        }

        int maxValue2 = 0;
        i=0;

        for(int num:nums){
            if(maxValue2<num && index!=i){
                maxValue2 = num-1;
            }
            i++;
        }

        return maxValue*maxValue2;
    }
}