class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> findDifference = new ArrayList<>();
        Set<Integer> temp1 = new HashSet<>();
        Set<Integer> temp2 = new HashSet<>();
        for (int num1 : nums1) {
            int flag = 0;
            for (int num2 : nums2) {
                if (num1 == num2)
                    flag = 1;
            }
            if (flag == 0)
                temp1.add(num1);
        }

        for (int num2 : nums2) {
            int flag = 0;
            for (int num1 : nums1) {
                if (num1 == num2)
                    flag = 1;
            }
            if (flag == 0)
                temp2.add(num2);
        }

        findDifference.add(temp1.stream().toList());
        findDifference.add(temp2.stream().toList());

        return findDifference;
    }
}