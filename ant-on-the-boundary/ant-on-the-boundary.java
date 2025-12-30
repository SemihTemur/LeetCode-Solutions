class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int returnToBoundaryCount = 0;
        int result = 0;

        for(int num:nums){
            result = result + num;
            if(result == 0)
                returnToBoundaryCount++;
        }

        return returnToBoundaryCount;
    }
}