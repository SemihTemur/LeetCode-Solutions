class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr1 = new HashSet<Integer>();
        Set<Integer> arr2 = new HashSet<Integer>();
        int index = 0;

        for(int num:nums1)
             arr1.add(num);

        for(int num:nums2)
             arr2.add(num);
        
        arr1.retainAll(arr2);

        int[] intersection = new int[arr1.size()];

        for(int num:arr1)
            intersection[index++] = num;
        
        return intersection;
    }
}