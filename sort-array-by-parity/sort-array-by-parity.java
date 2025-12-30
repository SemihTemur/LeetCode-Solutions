class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] sortArrayByParity = new int[nums.length];
        int firstIndex = 0;
        int lateIndex = nums.length;

        for(int num:nums){
            if(num%2==0)
                sortArrayByParity[firstIndex++] = num;
            else
                sortArrayByParity[--lateIndex] = num;
        }

        return sortArrayByParity;

    }
}