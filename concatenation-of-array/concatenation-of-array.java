class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = 2*nums.length,i=0;
        int[] ans = new int[size];
        int j=0;
        for(i=0;i<size;i++){
            if(j==nums.length)
                j=0;
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
}