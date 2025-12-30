class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int i = 0, toplam = 0;
        for (i = 0; i < nums.length; i++) {
            int j = i;
            while (j >= 0) {
                toplam = toplam + nums[j];
                j--;
            }
            runningSum[i] = toplam;
            toplam = 0;
        }

         return runningSum;
    }
}