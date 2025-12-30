class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] createTargetArray = new int[nums.length];
        int i=0;
        for(i=0;i<nums.length;i++){ // 0 1 2 3
            int j=nums.length-1;
            while(j>index[i]){
                createTargetArray[j] = createTargetArray[j-1];
                j--;
            }
            createTargetArray[index[i]] = nums[i];
        }
        return createTargetArray;
    }
}