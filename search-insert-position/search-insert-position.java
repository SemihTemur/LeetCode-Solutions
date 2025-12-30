class Solution {
    public int searchInsert(int[] nums, int target) {
        int  i;

        if (nums[0] >= target)
            return 0;
        if (nums[nums.length - 1] < target)
            return nums.length;

        for (i = 1; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }

        for (i = 1; i < nums.length; i++) {
            if (nums[i] > target)
                return i;
        }

        return 0;

    }
}