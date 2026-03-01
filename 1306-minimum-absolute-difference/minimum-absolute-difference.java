class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> minimumAbsDifference = new ArrayList<>();
        Arrays.sort(arr);

        int minDifference =  arr[1] - arr[0];;
        int i = 0;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDifference)
                minimumAbsDifference.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
            else if (arr[i + 1] - arr[i] < minDifference) {
                minDifference = arr[i+1] - arr[i];
                minimumAbsDifference.clear();
                minimumAbsDifference.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
            }
        }

        return minimumAbsDifference;
    }
}