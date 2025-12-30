class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int findMaxAverage = Integer.MIN_VALUE;
        int i = 0;
        for(i=0;i<nums.length;i++){
            if(i+k>nums.length)
                break;
            findMaxAverage = Math.max(findMaxAverage,sumAverageNums(i,i+k,nums));
        }

        return (double) findMaxAverage / k;
    }

    public static int sumAverageNums(int start,int end,int[] nums){
        int result = 0;

        for(;start<end;start++)
            result = result + nums[start];
        
        return result;
    }
}