class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterElement = new int[nums1.length];
        int i = 0, j = 0,k=0;
        for (i = 0; i < nums1.length; i++) {
            for (j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int max = nums2[j];
                    for(k=j;k<nums2.length;k++){
                        if(nums2[k]>max){
                            max = nums2[k];
                            break;
                        }
                    }

                    if(max!=nums2[j])
                        nextGreaterElement[i] = max;
                    else
                        nextGreaterElement[i] = -1;
                }
            }
        }

        return nextGreaterElement;
    }
}