class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numIdenticalPairs = 0,i,j;

        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    numIdenticalPairs++;
            }
        }

        return numIdenticalPairs;
    }
}