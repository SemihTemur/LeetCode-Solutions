class Solution {
    public int countPairs(int[] nums, int k) {
        int i = 0, j = 0, countPairs = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0)
                    countPairs++;
            }
        }
        return countPairs;
    }
}