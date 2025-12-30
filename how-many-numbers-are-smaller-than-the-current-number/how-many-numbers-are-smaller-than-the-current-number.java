class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumbersThanCurrent = new int[nums.length];
        int i = 0, j = 0, k = 0;

        for (i = 0; i < nums.length; i++) {
            int count = 0;
            for (j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            smallerNumbersThanCurrent[k] = count;
            k++;
        }
        return smallerNumbersThanCurrent;
    }
}