class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        int count1 = 0;
        int count2 = 0;

        for(int num:nums1){
            nums1Set.add(num);
        }

         for(int num:nums2){
            nums2Set.add(num);
        }

        for(int num:nums1){
            if(nums2Set.contains(num))
                count1++;
        }

         for(int num:nums2){
            if(nums1Set.contains(num))
                count2++;
        }

        return new int[]{count1,count2};

    }
}