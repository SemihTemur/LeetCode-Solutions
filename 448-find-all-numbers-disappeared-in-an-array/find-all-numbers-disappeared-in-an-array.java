class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> setNumsList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        int length = nums.length;
        int targetValue = 1;

        List<Integer> findDisappearedNumbers = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (!setNumsList.contains(targetValue))
                findDisappearedNumbers.add(targetValue);
            targetValue++;
        }

        return findDisappearedNumbers;
    }
}