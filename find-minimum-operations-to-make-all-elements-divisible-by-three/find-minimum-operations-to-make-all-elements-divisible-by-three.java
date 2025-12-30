class Solution {
    public int minimumOperations(int[] nums) {
        int minimumOperations = 0;
        for(int num:nums){
            if(num%3!=0)
                minimumOperations++;
        }
        return minimumOperations;
    }
}