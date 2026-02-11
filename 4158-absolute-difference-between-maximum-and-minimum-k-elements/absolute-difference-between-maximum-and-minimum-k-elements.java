class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int largest = 0;
        int smallest = 0;
        int i = 0;
        int j = nums.length - 1;

        while(i<k){
            largest = largest + nums[j--];
            smallest = smallest + nums[i++];
        }

        return Math.abs(largest-smallest);
    }
}