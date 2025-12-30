class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] decompressRLElistTemp = new int[100000];
        int i = 0,j=0;
        for(i=0;i<nums.length;){
            int freq = nums[i];
            int val = nums[i+1];
            int k = 1;
            while(k<=freq){
                decompressRLElistTemp[j] = val;
                k++;
                j++;
            }
            i = i+2;
        }

        int[] decompressRLElist = new int[j];

        for(i=0;i<j;i++){
            decompressRLElist[i] = decompressRLElistTemp[i];
        }

        return decompressRLElist;
    }
}