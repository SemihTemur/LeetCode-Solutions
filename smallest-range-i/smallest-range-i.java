class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0] + k,max = nums[nums.length-1];        
        if(max-min>=k)
            max = max + -k;
        else
            max = min;
        
        return max-min;
        
    }
}