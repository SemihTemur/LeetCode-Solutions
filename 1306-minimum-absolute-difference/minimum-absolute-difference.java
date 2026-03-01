class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> minimumAbsDifference = new ArrayList<>();
        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];

            if (diff == minDifference)
                minimumAbsDifference.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
            else if (diff < minDifference) {
                minDifference = diff;
                minimumAbsDifference.clear();
                minimumAbsDifference.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
            }
        }

        return minimumAbsDifference;
    }
}