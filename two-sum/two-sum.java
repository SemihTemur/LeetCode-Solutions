class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int[] sonuc = new int[2];
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sonuc[0] = i;
                    sonuc[1] = j;
                    break;
                }
            }

        }
        return sonuc;
    }
}
