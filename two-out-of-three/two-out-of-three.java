class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int i;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);

        for (i = 0; i < nums1.length; i++) {
            if (i != nums1.length - 1 && nums1[i] == nums1[i + 1])
                continue;
            maps.merge(nums1[i], 1, Integer::sum);
        }
        for (i = 0; i < nums2.length; i++) {
            if (i != nums2.length - 1 && nums2[i] == nums2[i + 1])
                continue;
            maps.merge(nums2[i], 1, Integer::sum);
        }
        for (i = 0; i < nums3.length; i++) {
            if (i != nums3.length - 1 && nums3[i] == nums3[i + 1])
                continue;
            maps.merge(nums3[i], 1, Integer::sum);
        }

        for (int key : maps.keySet()) {
            if (maps.get(key) > 1)
                list.add(key);
        }

        return list;
    }
}