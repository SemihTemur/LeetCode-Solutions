class Solution {
    public int maximizeSum(int[] nums, int k) {
        int i,sum=0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int value = nums[nums.length-1];
        for(i=0;i<k;i++){
            list.add(value);
            value++;
        }
        for(int num:list)
            sum = sum + num;
        return sum;
    }
}