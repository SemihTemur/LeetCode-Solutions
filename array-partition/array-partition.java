class Solution {
    public int arrayPairSum(int[] nums) {
        int arrayPairSum = 0,i=0;
        Arrays.sort(nums);

        for(i=0;i<nums.length;i=i+2){
            arrayPairSum = arrayPairSum + nums[i];
        }
        return arrayPairSum;
    }
}