class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0,minOperations=0;
        for(int num:nums)
            sum = sum + num;
        
        while(sum%k!=0){
            sum--;
            minOperations++;
        }
        return minOperations;
    }
}