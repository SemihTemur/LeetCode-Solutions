class Solution {
    public int firstMissingPositive(int[] nums) {
        int firstMissingPositive=1,i;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            if(nums[i]<=0 || (i<nums.length-1 && nums[i]==nums[i+1]))
                continue;
            if(firstMissingPositive!=nums[i])
                return firstMissingPositive;
            else
                firstMissingPositive++;
        }
        return firstMissingPositive;
    }
}