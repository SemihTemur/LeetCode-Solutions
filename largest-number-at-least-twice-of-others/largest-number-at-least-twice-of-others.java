class Solution {
    public int dominantIndex(int[] nums) {
        int maxNumber = nums[0];
        int i = 0;
        int maxNumberIndex = 0;
        
        for(i = 0;i<nums.length;i++){
            if(maxNumber<nums[i]){
                maxNumber = nums[i];
                maxNumberIndex = i;
            }          
        }
        
        for(i = 0;i<nums.length;i++){
            if(i==maxNumberIndex)
                continue;
            if(maxNumber<nums[i]*2)
                return -1;
        }
        
        return maxNumberIndex;
    }
}